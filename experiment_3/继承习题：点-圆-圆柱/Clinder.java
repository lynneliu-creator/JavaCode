package project;

public class Clinder extends Circle{
	double height;
	
	public void setHeight(double h) {
		this.height=h;
	}

	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return 2*super.getArea()+height*getCircumference();
	}
	
	public String toString() {
		return ("圆柱体的表面积是:"+getArea());
	}
	
	public Clinder() {
		this.height=getHeight();
		x=getX();
		y=getY();
		radius=getRadius();
	}
	
	public Clinder(int xValue,int yValue,double radiusValue,double heightValue) {
		this.height=heightValue;
		this.radius=radiusValue;
		this.x=xValue;
		this.y=yValue;
		
	}
}
