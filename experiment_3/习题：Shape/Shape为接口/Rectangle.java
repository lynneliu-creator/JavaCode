package project3;

public class Rectangle implements Shape{
	
	public double length;
	public double width;
	
	public Rectangle(double l,double w) {
		this.length=l;
		this.width=w;
	}
	
	public String toString() {
		return("�����εĳ��Ϳ��ǣ�"+length+" "+width+"   ����ǣ�"+area());
	}
	
	public double area() {
		return length*width;
	}

}
