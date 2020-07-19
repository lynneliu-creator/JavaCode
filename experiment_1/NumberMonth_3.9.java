package my_project;
import java.util.Scanner;
public class NumberMonth {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int Number;
			do {
				System.out.println("请输入一个1~12之间的整数：");
				Number=input.nextInt();
			}while(Number<1||Number>12);
        switch(Number)
        {
        case 1:System.out.printf("January");
        break;
        case 2:System.out.printf("February");
        break;
        case 3:System.out.printf("March");
        break;
        case 4:System.out.printf("April");
        break;
        case 5:System.out.printf("May");
        break;
        case 6:System.out.printf("June");
        break;
        case 7:System.out.printf("July");
        break;
        case 8:System.out.printf("August");
        break;
        case 9:System.out.printf("September");
        break;
        case 10:System.out.printf("October");
        break;
        case 11:System.out.printf("November");
        break;
        case 12:System.out.printf("December");
        break;
        default:break;
		}
		// TODO Auto-generated method stub

	}

}
