package my_project;
import java.util.Scanner;
public class IntNumber {

	public static void main(String[] args) {
		int Number,i=0,j=0;
		System.out.println("������һϵ����������0������");
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			Number=scanner.nextInt();
			if(Number>0) i++;
			if(Number<0) j++;
			if(Number==0) break;
		}
		System.out.printf("�������ĸ�����:%d\n",i);
		System.out.printf("�������ĸ�����:%d\n",j);
		// TODO Auto-generated method stub

	}

}
