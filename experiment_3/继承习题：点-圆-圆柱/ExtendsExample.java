package project;


public class ExtendsExample {

	public static void main(String[] args) {
		
		Point p=new Point(2,3);
		System.out.println(p.toString());
		
		Clinder C=new Clinder(4,5,6,2);
		System.out.println(C.toString());
		
		C.setRadius(3);
		C.setX(3);
		System.out.println(C.toString());

	}

}
