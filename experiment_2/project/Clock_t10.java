package project;
//实现功能：开始计时、停止计时、归零、读取分针秒针、总时间的毫秒数
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Clock extends JFrame implements Runnable,ActionListener{
	private int minute=0;
	private int second=0;
	private int limit=60;
	private Thread mb;
	private boolean isRun;
	private Button start,stop,reset;
	private Label display;
	
	public Clock(){
	start=new Button("开始");
	stop=new Button("停止");
	reset=new Button("重置");
	display=new Label();
	this.setLayout(null);
	display.setBounds(40,30,200,50);
	start.setBounds(20,80,50,50);
	stop.setBounds(80,80,50,50);
	reset.setBounds(140,80,50,50);
	refresh();
	add(display);
	add(start);
	start.addActionListener(this);
	stop.addActionListener(this);
	reset.addActionListener(this);
	add(stop);
	add(reset);
	setSize(300,200);
	show();
	
	this.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});
	}
	
	public void run(){
		while(isRun){
		try{
		second+=1;
		Thread.sleep(1000);
		if(second==limit){
		second=0;
		minute+=1;
		System.out.print(minute);
		}
		refresh();
		}
		catch(Exception e){}
		}
		}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("开始")){
		startCount();
		}
		else if(e.getActionCommand().equals("停止")){
		stopCount();
		}
		else{
		reset();
		}
		}
	
	public void refresh(){
		display.setText(toString());
		}
	
	public void startCount(){
		if(!isRun){
		isRun=true;
		mb=new Thread(this);
		mb.start();
		}
		}
	
	public void stopCount(){
		if(isRun){
		isRun=false;
		}
		}
	
	public void reset(){
		isRun=false;
		minute=0;
		second=0;
		refresh();
		}
	
	public int getMinute(){
		return minute;
		}
	
	public double getSecond(){
		return second;
		}
	//获得总毫秒数
	public int getTotalTime(){
		return (60*1000*minute)+(second*1000);
		}
	
	public String toString(){
		return " "+minute+" 分 "+second+" 秒"+"       共 "+getTotalTime()+" 毫秒";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Clock();

	}

}
