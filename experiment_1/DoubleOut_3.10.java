package my_project;

import java.util.Scanner;

public class DoubleOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double d;
		System.out.println("请输入一个浮点数：");
		d=input.nextDouble();
		String sd=String.valueOf(d);
		System.out.println("整数部分："+(int)d);
		System.out.println("小数部分："+(d+"").substring(1+((d+"").indexOf("."))));
	}

}
