package my_project;
import java.util.Scanner;
public class Fibonacci{

	public static int fibonacci(int i)
	{
		if(i==0||i==1)
			return i;
		return fibonacci(i-1)+fibonacci(i-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("[递归法]请输入斐波那契数列的项数：");
		n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonacci(i)+"\t");
			if(i%5==4)
				System.out.println();
		}
		
		System.out.print("[迭代循环法]请输入斐波那契数列的项数：");
		int f0=0,f1=1,f;
		n=input.nextInt();
		for(int j=0;j<n;j++)
		{
			System.out.print(f0+"\t");
			if(j%5==4)
				System.out.println();
			f=f0+f1;
			f0=f1;
			f1=f;
		}
	}

}
