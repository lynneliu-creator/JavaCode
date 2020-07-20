package project3;

public class Square implements Shape{
	
	public double side;
	
	public Square(double s) {
		this.side=s;
		
	}
	
	public String toString() {
		return("正方形的边长是："+side+"  面积是"+area());
	}
	
	public double area() {
		return side*side;
	}

}
