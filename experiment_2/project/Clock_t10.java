package project;
//ʵ�ֹ��ܣ���ʼ��ʱ��ֹͣ��ʱ�����㡢��ȡ�������롢��ʱ��ĺ�����
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
	start=new Button("��ʼ");
	stop=new Button("ֹͣ");
	reset=new Button("����");
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
		if(e.getActionCommand().equals("��ʼ")){
		startCount();
		}
		else if(e.getActionCommand().equals("ֹͣ")){
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
	//����ܺ�����
	public int getTotalTime(){
		return (60*1000*minute)+(second*1000);
		}
	
	public String toString(){
		return " "+minute+" �� "+second+" ��"+"       �� "+getTotalTime()+" ����";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Clock();

	}

}
