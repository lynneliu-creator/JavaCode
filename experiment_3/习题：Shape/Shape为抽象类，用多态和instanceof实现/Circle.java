package project2;

public class Circle extends Shape{
	public double r;
	
	public Circle() {
		
	}
	
	public void getR(double R) {
		this.r=R;
	}
	

	public String toString() {
		return("圆的半径是"+r+"   圆的面积是："+area());
	}
	
	public double area() {//重写抽象方法
		return r*r*Math.PI;
	}
	


}
