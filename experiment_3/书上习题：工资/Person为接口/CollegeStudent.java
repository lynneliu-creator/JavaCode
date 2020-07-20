package project2;

public class CollegeStudent implements Person{
	public double scholarship;
	
	public CollegeStudent() {
		this.scholarship=1500;
	}
	
	public double pay() {
		return scholarship;
	}
}
