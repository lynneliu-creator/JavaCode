package my_project;
import java.io.*;
public class PrintMinChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符，以“#”结束：");
		char min='\uffff';
		while(true)
		{
			char c=' ';
			try {
			c=(char)System.in.read();
		  }catch(IOException e) {}
			if(c=='#') break;
			if(min>c) min=c;
		}
		System.out.println("按字典次序最小的字符是："+min);
		   

	}

}
