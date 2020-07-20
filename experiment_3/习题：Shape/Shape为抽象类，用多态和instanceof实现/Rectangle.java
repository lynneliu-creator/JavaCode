package project2;

public class Rectangle extends Shape{

	public double length;
	public double width;
	
	public Rectangle() {
		
	}
	
	public void getLW(double l,double w) {
		this.length=l;
		this.width=w;
	}
	
	
	public String toString() {
		return("长方形的长和宽是："+length+" "+width+"   面积是："+area());
	}
	
	public double area() {//重写抽象方法
		return length*width;
	}
	
}
