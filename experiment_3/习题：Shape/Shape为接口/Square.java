package project3;

public class Square implements Shape{
	
	public double side;
	
	public Square(double s) {
		this.side=s;
		
	}
	
	public String toString() {
		return("�����εı߳��ǣ�"+side+"  �����"+area());
	}
	
	public double area() {
		return side*side;
	}

}
