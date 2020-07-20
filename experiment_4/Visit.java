package project3;

import java.util.Date;

public class Visit {
	public Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	
	public Visit(String name,Date date) {
		//���⣺����ж�visit��name��customer����
			this.date=date;
		
	}
	
	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setServiceExpense(double ex) {
		this.serviceExpense=ex;
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public void setProductExpense(double ex) {
		this.productExpense=ex;
	}
	
	public double getTotalExpense() {
		return serviceExpense+productExpense;
	}
	
	public String toString() {
		return ("Date:"+date+"   Customer:"+getName()+"  service Expense:"+getServiceExpense()+"  product Expense:"+getProductExpense()+" total Expense:"+getTotalExpense());
	}
	
}
