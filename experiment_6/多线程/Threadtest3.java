package project5;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Threadtest3 extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	threadclock thread1,thread2,thread3;
	
	public Threadtest3() {
		super("three clocks running together");
		this.setLayout(new FlowLayout());
		label1=new JLabel("00:00:00");
		label2=new JLabel("00:00:00");
		label3=new JLabel("00:00:00");
		thread1=new threadclock(label1,1000);
		thread1.start();
		thread2=new threadclock(label2,5000);
		thread2.start();
		thread3=new threadclock(label3,10000);
		thread3.start();
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.setSize(300,100);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class threadclock extends Thread{
		private long time;
		private long sec,min,hour;
		private JLabel label;
		public threadclock(JLabel La,long t) {
			this.time=t;
			this.label=La;
			this.sec=0;
			this.min=0;
			this.hour=0;
		}
		
		public void run() {
			try {
				while(true) {
					sec+=time/1000;
					if(sec>=59) {
						min++;
						sec=0;
						if(min>=59) {
							hour++;
							min=0;
						}
					}
					
					label.setText(hour+":"+min+":"+sec);
					Thread.sleep(time);
				}
			}
			catch(Exception e){
				System.out.println(e.toString());
		
			}
		
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadtest3 t=new Threadtest3();
	}

}
