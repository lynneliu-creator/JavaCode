package project3;

public class Rectangle implements Shape{
	
	public double length;
	public double width;
	
	public Rectangle(double l,double w) {
		this.length=l;
		this.width=w;
	}
	
	public String toString() {
		return("长方形的长和宽是："+length+" "+width+"   面积是："+area());
	}
	
	public double area() {
		return length*width;
	}

}
