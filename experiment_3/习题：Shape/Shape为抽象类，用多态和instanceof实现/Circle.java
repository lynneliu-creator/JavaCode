package project2;

public class Circle extends Shape{
	public double r;
	
	public Circle() {
		
	}
	
	public void getR(double R) {
		this.r=R;
	}
	

	public String toString() {
		return("Բ�İ뾶��"+r+"   Բ������ǣ�"+area());
	}
	
	public double area() {//��д���󷽷�
		return r*r*Math.PI;
	}
	


}
