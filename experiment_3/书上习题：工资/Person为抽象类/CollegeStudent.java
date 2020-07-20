package project;

public class CollegeStudent extends Person {
	
	public double scholarship;
	
	public CollegeStudent() {
		this.scholarship=3000;
	}
	
	public double pay() {
		return scholarship;
	}
}
