package my_project;

import java.util.Scanner;

public class DoubleOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double d;
		System.out.println("������һ����������");
		d=input.nextDouble();
		String sd=String.valueOf(d);
		System.out.println("�������֣�"+(int)d);
		System.out.println("С�����֣�"+(d+"").substring(1+((d+"").indexOf("."))));
	}

}
