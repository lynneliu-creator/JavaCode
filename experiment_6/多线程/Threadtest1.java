package project5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Threadtest1 extends JFrame {
	
	private JLabel label1,label2;
	private JTextField string1,string2;
	private JTextField sleep1,sleep2;
	private JButton start1,start2;
	private JButton stop1,stop2;
	private Threadtest thread1,thread2;
	
	class Threadtest extends Thread{
		private long sleeptime;
		private boolean flag=true;
		private String string;
		JTextField showfield,sleepfield;
		public Threadtest(JTextField text,JTextField sleeptext,String s,long t) {
			this.string=s;
			this.showfield=text;
			this.sleeptime=t;
			this.sleepfield=sleeptext;
		}
		
		public void run() {
			String S1=" ";
			int k=0;
			sleepfield.setText(" "+sleeptime);
			showfield.setText(string);
			while(flag) {
				try {
					for(int i=0;i<k;i++){
						S1+=" ";
					}
					k++;
					showfield.setText(S1+string);
					Thread.sleep(sleeptime);
				}
				catch(Exception e) {
					System.out.println(e.toString());
				}
			}
		}
	}
	
	public Threadtest1() {
		super("Welcome");
		this.setLayout(new FlowLayout());
		label1=new JLabel("sleep");
		label2=new JLabel("sleep");
		string1=new JTextField(70);
		string2=new JTextField(70);
		sleep1=new JTextField(10);
		sleep2=new JTextField(10);
		start1=new JButton("启动");
		start2=new JButton("启动");
		stop1=new JButton("中断");
		stop2=new JButton("中断");
		thread1=new Threadtest(string1,sleep1,"Welcome!",970);
		thread2=new Threadtest(string2,sleep2,"How are you?",560);
		this.add(string1);
		this.add(label1);
		this.add(sleep1);
		this.add(start1);
		this.add(stop1);
		this.add(string2);
		this.add(label2);
		this.add(sleep2);
		this.add(start2);
		this.add(stop2);
		start1.addActionListener(new ButtonListener());
		start2.addActionListener(new ButtonListener());
		stop1.addActionListener(new ButtonListener());
		stop2.addActionListener(new ButtonListener());
		this.setSize(700,200);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
			if(arg0.getSource()==start1) {
				try {
					thread1.start();
				}
				catch(IllegalThreadStateException i) {
					System.out.println(i.toString());
				}
			}
			
			if(arg0.getSource()==start2) {
				try {
					thread2.start();
				}
				catch(IllegalThreadStateException i) {
					System.out.println(i.toString());
				}
			}
			
			if(arg0.getSource()==stop1) {
				thread1.flag=false;
			}
			
			if(arg0.getSource()==stop2) {
				thread2.flag=false;
			}
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadtest1 t=new Threadtest1();

	}

}
