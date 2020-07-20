package project3;

public class Circle implements Shape {
	
	public double r;
	
	public Circle(double R) {
		this.r=R;
		
	}

	public String toString() {
		return("圆的半径是"+r+"   圆的面积是："+area());
	}
	
	public double area() {
		
		return r*r*Math.PI;
	}
	
}
