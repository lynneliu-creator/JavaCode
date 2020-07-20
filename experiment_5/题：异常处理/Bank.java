package project4;
import java.util.Scanner;

class NumberException extends Exception{
	public NumberException(String msg) {
		super(msg);
	}
}

public class Bank {
	private double deposit;//存款
	
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
				NumberException e=new NumberException("余额不足！");
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
			System.out.println("账户余额为："+b1.Getdeposit());
			System.out.println("请输入操作号");
			System.out.println("1、存款");
			System.out.println("2、取款");
			int num;
			num=sc.nextInt();
			double money;
			switch(num) {
			case 1:
				System.out.print("请输入存款额：");
				money=sc.nextDouble();
				b1.Saving(money);
				System.out.println("存款成功！");
				break;
			case 2:
				System.out.print("请输入取款额：");
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
