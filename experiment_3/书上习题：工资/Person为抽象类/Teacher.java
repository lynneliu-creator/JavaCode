package project;

public class Teacher extends Person{
	private double basepay;
	private double hours;
	
	public Teacher() {
		this.basepay=3000;
		this.hours=30;
	}
	
	public double pay() {
		return basepay+hours*30;
	}
	

}
