package project2;

public class Square extends Shape{

	public double side;
	
	public Square() {
		
	}
	
	public void getSide(double s) {
		this.side=s;
	}
	
	public String toString() {
		return("�����εı߳��ǣ�"+side+"  �����"+area());
	}
	
	public double area() {//��д���󷽷�
		return side*side;
	}
}
