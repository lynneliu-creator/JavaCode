package project2;

public class Teacher implements Person{
	private double basepay;
	private double hours;
	
	public Teacher() {
		this.basepay=2000;
		this.hours=40;
	}
	
	public double pay() {
		return basepay+hours*30;
	}

}
