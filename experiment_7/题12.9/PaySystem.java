package project6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.*;
import javax.swing.*;

class employee implements Serializable{
	private String id;
	private String name;
	private String addr;
	private String pay;
	
	public employee(String ID,String Name,String Addr,String Pay) {
		this.id=ID;
		this.name=Name;
		this.addr=Addr;
		this.pay=Pay;
	}
	
	public String getID(){
		return id;
	}
	
	public void setID(String ID){
		this.id=ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name=Name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String Addr) {
		this.addr=Addr;
	}
	 
	public String getPay() {
		return pay;
	}
	
	public void setPay(String Pay) {
		this.pay=Pay;
	}
	
	public String tostring() {
		return (getID()+"^"+getName()+"^"+getAddr()+"^"+getPay());
	}
	
}


public class PaySystem extends JFrame {

	private Vector<employee> emplo;
	JTextArea showarea;
	JTextArea searcharea;
	JButton Addbutton;
	JButton Modibutton;
	JButton Delebutton;
	JButton Searbutton;
	JLabel add_id;
	JLabel add_name;
	JLabel add_addr;
	JLabel add_pay;
	JLabel needmod_id;
	JLabel mod_id;
	JLabel mod_name;
	JLabel mod_addr;
	JLabel mod_pay;
	JLabel del_id;
	JLabel sea_id;
	JTextField id_add;
	JTextField name_add;
	JTextField addr_add;
	JTextField pay_add;	
	JTextField id_needmod;
	JTextField id_mod;
	JTextField name_mod;
	JTextField addr_mod;
	JTextField pay_mod;	
	JTextField id_del;
	JTextField id_sea;
	
	
	public PaySystem() {
		super("工资支付系统");
		this.setLayout(new FlowLayout());
		emplo=new Vector<>();
		ReadFile();
		Addbutton=new JButton("添加雇员记录");
		Modibutton=new JButton("修改雇员记录");
		Delebutton=new JButton("删除雇员记录");
		Searbutton=new JButton("查询雇员记录");
		add_id=new JLabel("雇员号");
		add_name=new JLabel("姓名");
		add_addr=new JLabel("地址");
		add_pay=new JLabel("工资");
		needmod_id=new JLabel("要修改的雇员号");
		mod_id=new JLabel("修改后的雇员号");
		mod_name=new JLabel("姓名");
		mod_addr=new JLabel("地址");
		mod_pay=new JLabel("工资");
		del_id=new JLabel("雇员号");
		sea_id=new JLabel("雇员号");
		id_add=new JTextField(10);
		name_add=new JTextField(10);
		addr_add=new JTextField(10);
		pay_add=new JTextField(10);
		id_mod=new JTextField(10);
		id_needmod=new JTextField(10);
		name_mod=new JTextField(10);
		addr_mod=new JTextField(10);
		pay_mod=new JTextField(10);
		id_del=new JTextField(10);
		id_sea=new JTextField(10);
		showarea=new JTextArea(5,65);
		searcharea=new JTextArea(1,65);
		this.add(showarea);
		this.add(add_id);
		this.add(id_add);
		this.add(add_name);
		this.add(name_add);
		this.add(add_addr);
		this.add(addr_add);
		this.add(add_pay);
		this.add(pay_add);
		this.add(Addbutton);
		this.add(needmod_id);
		this.add(id_needmod);
		this.add(mod_id);
		this.add(id_mod);
		this.add(mod_name);
		this.add(name_mod);
		this.add(mod_addr);
		this.add(addr_mod);
		this.add(mod_pay);
		this.add(pay_mod);
		this.add(Modibutton);
		this.add(del_id);
		this.add(id_del);
		this.add(Delebutton);
		this.add(sea_id);
		this.add(id_sea);
		this.add(Searbutton);
		this.add(searcharea);
		for(int i=0;i<emplo.size();i++) {
			showarea.append(emplo.elementAt(i).tostring());
			showarea.append("\n");
		}
		Addbutton.addActionListener(new buttonListener());
		Modibutton.addActionListener(new buttonListener());
		Delebutton.addActionListener(new buttonListener());
		Searbutton.addActionListener(new buttonListener());
		this.setSize(700,400);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String ButtonName=arg0.getActionCommand();
			if(ButtonName.equals("添加雇员记录")){
				employee e=new employee(id_add.getText(),name_add.getText(),addr_add.getText(),pay_add.getText());
				emplo.add(e);
			}
			
			if(ButtonName.equals("修改雇员记录")) {
				for(int i=0;i<emplo.size();i++)
				{
					if(id_needmod.getText().equals(emplo.elementAt(i).getID())) {
						emplo.elementAt(i).setID(id_mod.getText());
						emplo.elementAt(i).setName(name_mod.getText());
						emplo.elementAt(i).setAddr(addr_mod.getText());
						emplo.elementAt(i).setPay(pay_mod.getText());				
					}
				}
			}
			if(ButtonName.equals("删除雇员记录")) {
				for(int i=0;i<emplo.size();i++) {
					if(id_del.getText().equals(emplo.elementAt(i).getID())) {
						emplo.removeElementAt(i);
					}
				}
			}
			if(ButtonName.equals("查询雇员记录")) {
				searcharea.setText("");
				for(int i=0;i<emplo.size();i++) {
					if(id_sea.getText().equals(emplo.elementAt(i).getID())) {
						searcharea.append(emplo.elementAt(i).tostring()+"\n");
					}
				}
			}
			
			//更新showarea
			showarea.setText("");
			for(int i=0;i<emplo.size();i++) {
				showarea.append(emplo.elementAt(i).tostring());
			}
		}
	}
	
	
	public void ReadFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("PaySystem.txt")); 
			String s;
			while((s=reader.readLine())!=null) {
				String[] s1=s.split("\\^");
				employee e=new employee(s1[0],s1[1],s1[2],s1[3]);
				emplo.add(e);
			}
			reader.close();
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void SaveFile() {
		 try {
			 String s;
			 FileWriter file=new FileWriter("PaySystem.txt");
			 BufferedWriter writer = new BufferedWriter(file); 
			 for(int i=0;i<emplo.size();i++) {
				 writer.write(emplo.elementAt(i).tostring()); 
				 writer.newLine();
			 }		
			 writer.close();
			}
		 catch(IOException e){
				System.out.println(e.toString());
			}
			

	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PaySystem p=new PaySystem();
		p.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				p.SaveFile();
				System.exit(0);
			}
		});
		
		
	}

}
