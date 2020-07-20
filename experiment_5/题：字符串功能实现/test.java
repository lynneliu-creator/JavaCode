package project4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
        
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String text=buffer.readLine();

		StringFunction str=new StringFunction();
		
		str.StringSort(text);
		str.Countchar(text);
		str.WordinString(text);
	}

}
