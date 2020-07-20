package project6;

import java.io.*;

public class writefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
			BufferedWriter writer = new BufferedWriter(new FileWriter("writefile.txt")); 
			String s = null; 
			while(!(s = reader.readLine()).equals("exit")) { 
			writer.write(s); 
			writer.newLine(); 
		}
			reader.close();
			writer.close();
		}catch(IOException i)
		{
			System.out.println(i.toString());
		}	

	}

}
