package project6;


import java.io.*;

public class CalcuChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Charsum=0,Linesum=0;
		try {	
			String s;
			BufferedReader reader = new BufferedReader(new FileReader("file.txt")); 
			while((s= reader.readLine())!=null) { 
				Charsum+=s.length();
				Linesum++;
		}
			reader.close();
		}catch(IOException i)
		{
			System.out.println(i.toString());
		}
		
		System.out.println("file文件的字符个数为："+Charsum+"行数为："+Linesum);
		
	}

}
