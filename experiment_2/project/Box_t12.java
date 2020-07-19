package project;

public class Box {
	private double length=0.0;
	private double width=0.0;
	private double height=0.0;
	
	//无参
	public Box() {
		height=20;
		width=20;
		length=3;
	}
	//一个参
	public Box(double length) {
		this.length=length;
		height=30;
		width=2;
	}
	//三个参
	public Box(double length,double width,double height) {
		this.height=height;
		this.length=length;
		this.width=width;
		
	}

	public double Volume() {
		return length*width*height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("调用无参的构造函数：");
		Box box1=new Box();
		System.out.println(box1.Volume());
		
		System.out.println("调用有一个参数的构造函数：");
		Box box2=new Box(3);
		System.out.println(box2.Volume());
		
		System.out.println("调用有三个参数的构造函数：");
		Box box3=new Box(20,3,4);
		System.out.println(box3.Volume());
		
		

	}

}
