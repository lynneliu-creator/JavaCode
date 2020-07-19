package my_project;

import java.util.Scanner;

public class EnlargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int number;
		number=input.nextInt();
		number=(number<<6)+(number<<5)+(number<<2);
		System.out.println("通过位运算扩大100倍后的值是："+number);

	}

}
