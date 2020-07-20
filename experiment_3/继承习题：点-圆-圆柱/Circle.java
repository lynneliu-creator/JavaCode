package project;

public class Circle extends Point{
	double radius;
	
	public void setRadius(double r) {
		this.radius=r;
	}
	
	public double getRadius() {
		return radius;
	}

	public  double getDiameter() {
		return 2*radius;
	}
	
	public double getCircumference() {
		return 2*radius*Math.PI;
	}
	
	public double getArea() {
		return  radius*radius*Math.PI;
	}
	
	public String toString() {
		return ("Բ�İ뾶�ǣ�"+radius+" ֱ����:"+getDiameter()+"  �ܳ���:"+getCircumference()+"   �����:"+getArea());
	}
	
	public Circle() {
		radius=getRadius();
		x=getX();
		y=getY();
	}
	
	public Circle(int xValue,int yValue,double radiusValue) {
		this.x=xValue;
		this.y=yValue;
		this.radius=radiusValue;
		
	}
}
