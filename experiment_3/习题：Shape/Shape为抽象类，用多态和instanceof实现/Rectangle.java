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
		return("�����εĳ��Ϳ��ǣ�"+length+" "+width+"   ����ǣ�"+area());
	}
	
	public double area() {//��д���󷽷�
		return length*width;
	}
	
}
