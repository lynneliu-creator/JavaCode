package project5;

import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Threadtest2 extends JFrame{
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JTextField string1;
	JTextField string2;
	JTextField string3;
	JCheckBox check1;
	JCheckBox check2;
	JCheckBox check3;

	Runner r1=new Runner ();
	Thread t1=new Thread(r1,"线程1");
	Runner r2=new Runner();
	Thread t2=new Thread(r2,"线程2");
	Runner r3=new Runner();
	Thread t3=new Thread(r3,"线程3");
	
	
	
	
	public Threadtest2() {
		this.setLayout(new GridLayout(3,3));
		label1=new JLabel("线程1：");
		label2=new JLabel("线程2：");
		label3=new JLabel("线程3：");
		string1=new JTextField(10);
		string2=new JTextField(10);
		string3=new JTextField(10);
		check1=new JCheckBox("线程挂起");
		check2=new JCheckBox("线程挂起");
		check3=new JCheckBox("线程挂起");
		this.add(label1);
		this.add(string1);
		this.add(check1);
		this.add(label2);
		this.add(string2);
		this.add(check2);
		this.add(label3);
		this.add(string3);
		this.add(check3);
		t1.start();
		t2.start();
		t3.start();
		this.setSize(700,200);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	class Runner implements Runnable{
		int num;
		public void run() {
			while(true) {
				if((Thread.currentThread().getName().equals("线程1"))&&!check1.isSelected()) {
					num=(int)(Math.random()*26);
					string1.setText((char)(num+65)+" ");
				}
				if((Thread.currentThread().getName().equals("线程2"))&&!check2.isSelected()) {
					num=(int)(Math.random()*26);
					string2.setText((char)(num+65)+" ");
				}
				if((Thread.currentThread().getName().equals("线程3"))&&!check3.isSelected()) {
					num=(int)(Math.random()*26);
					string3.setText((char)(num+65)+" ");
				}

				try {
					Thread.sleep(500);
					}
				catch(InterruptedException e) {
					System.err.println(e.toString());
				}	
			}
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadtest2 t=new Threadtest2();
	}

}
