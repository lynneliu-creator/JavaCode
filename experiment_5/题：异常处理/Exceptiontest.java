package project4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum;
		double i,j;
		Scanner sc=new Scanner(System.in);
		try {
			i=sc.nextDouble();
			j=sc.nextDouble();
			sum=i+j;
			System.out.println("��Ϊ��"+sum);
		}
		catch(InputMismatchException e) {
			System.out.println("�����ʽ����");
		}

	}

}
