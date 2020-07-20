package project;

public class Point {
	int x;
	int y;
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return ("x:"+x+"  y:"+y);
	}

	public Point() {
		x=getX();
		y=getY();
	}
	
	public Point(int xValue,int yValue) {
		this.x=xValue;
		this.y=yValue;
	}
}
