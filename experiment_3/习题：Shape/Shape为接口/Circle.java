package project3;

public class Circle implements Shape {
	
	public double r;
	
	public Circle(double R) {
		this.r=R;
		
	}

	public String toString() {
		return("Բ�İ뾶��"+r+"   Բ������ǣ�"+area());
	}
	
	public double area() {
		
		return r*r*Math.PI;
	}
	
}
