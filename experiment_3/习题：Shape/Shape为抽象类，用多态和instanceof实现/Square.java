package project2;

public class Square extends Shape{

	public double side;
	
	public Square() {
		
	}
	
	public void getSide(double s) {
		this.side=s;
	}
	
	public String toString() {
		return("正方形的边长是："+side+"  面积是"+area());
	}
	
	public double area() {//重写抽象方法
		return side*side;
	}
}
