package project3;

import java.util.Date;

public class BuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Customer C1=new Customer("张三");
		C1.setMember(true);
		C1.setMemberType("Premium");
		
		
		Date date1=new Date();
		Visit V1=new Visit("张三",date1);
		


		V1.setProductExpense(300*DiscountRate.getProductDiscountRate(V1.customer.getMemberType()));
		V1.setServiceExpense(100*DiscountRate.getServiceDiscountRate(V1.customer.getMemberType()));
		
		System.out.println(V1.toString());
		
				

	}

}
