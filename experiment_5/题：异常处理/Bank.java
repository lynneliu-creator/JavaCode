package project4;
import java.util.Scanner;

class NumberException extends Exception{
	public NumberException(String msg) {
		super(msg);
	}
}

public class Bank {
	private double deposit;//���
	
	public Bank(double money) {
		this.deposit=money;
	}

	
	public double Getdeposit() {
		return deposit;
	}
	
	public void Saving(double money) {
		deposit+=money;
	}
	
	public void Geting(double money) throws NumberException{
		try{
			if(deposit-money<0) {
				NumberException e=new NumberException("���㣡");
				throw e;
			}
			deposit-=money;
		}
		catch(NumberException e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String arge[]) {
		Bank b1=new Bank(2000);
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("�˻����Ϊ��"+b1.Getdeposit());
			System.out.println("�����������");
			System.out.println("1�����");
			System.out.println("2��ȡ��");
			int num;
			num=sc.nextInt();
			double money;
			switch(num) {
			case 1:
				System.out.print("��������");
				money=sc.nextDouble();
				b1.Saving(money);
				System.out.println("���ɹ���");
				break;
			case 2:
				System.out.print("������ȡ��");
				try {
					money=sc.nextDouble();
					b1.Geting(money);
				}
				catch(NumberException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
		}
		
		
		
	}
	
}
