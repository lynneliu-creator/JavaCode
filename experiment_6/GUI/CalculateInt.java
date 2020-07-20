package project5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CalculateInt extends JFrame {
	JLabel label1;
	JTextField edit1;
	JTextField edit2;
	JButton calcu;
	JTextArea showarea;
	
	public CalculateInt() {
		super("整数计算器");
		this.setLayout(new FlowLayout());
		label1=new JLabel("请输入两个整型数据:");
		edit1=new JTextField(10);
		edit2=new JTextField(10);
		calcu=new JButton("计算");
		showarea=new JTextArea(3,6);
		this.add(label1);
		this.add(edit1);
		this.add(edit2);
		this.add(calcu);
		this.add(showarea);
		calcu.addActionListener(new CalcuListener());
		this.setSize(700,200);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	class CalcuListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String s1=edit1.getText();
			String s2=edit2.getText();
			if(!(s1.matches("[0-9]*")&&s2.matches("[0-9]*"))) {
				JOptionPane.showMessageDialog(null, "请输入整型数据", "输入有误",JOptionPane.ERROR_MESSAGE);
			}
			
			
			int result;
			result=Integer.valueOf(s1)+Integer.valueOf(s2);
			showarea.setText(s1+" + "+s2+" = "+result+"\n");
			result=Integer.valueOf(s1)-Integer.valueOf(s2);
			showarea.append(s1+" - "+s2+" = "+result+"\n");
			result=Integer.valueOf(s1)*Integer.valueOf(s2);
			showarea.append(s1+" * "+s2+" = "+result+"\n");
			if(Integer.valueOf(s2)==0) {
				showarea.append("除数不能为零\n");
			}
			else {
				result=Integer.valueOf(s1)/Integer.valueOf(s2);
				showarea.append(s1+" / "+s2+" = "+result+"\n");
				result=Integer.valueOf(s1)%Integer.valueOf(s2);
				showarea.append(s1+" % "+s2+" = "+result+"\n");
			}
			
		
		}
	}
	
	public static void main(String[] args) {
		CalculateInt c=new CalculateInt();
	}
	

}
