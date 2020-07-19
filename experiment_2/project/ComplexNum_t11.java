package project;

import java.util.Scanner;

public class ComplexNum {
	double real;
	double image;
	
	public ComplexNum(double real,double image) {
		
		this. real=real;
		this. image=image;
		
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImage() {
		return image;
	}
	
	
	//相加
	public ComplexNum add(ComplexNum c){ 
			double real2 = c.getReal();
			double image2 = c.getImage();
			double newReal = real + real2;
			double newImage = image + image2;
			ComplexNum result = new ComplexNum(newReal,newImage);
			return result;
		}
	
	//相减
	public ComplexNum sub(ComplexNum c){
			double real2 = c.getReal();
			double image2 = c.getImage();
			double newReal = real - real2;
			double newImage = image - image2;
			ComplexNum result = new ComplexNum(newReal,newImage);
			return result;
		}
		
	//相乘
	public	ComplexNum mul(ComplexNum a){
			double real2 = a.getReal();
			double image2 = a.getImage();
			double newReal = real*real2-image*image2;
			double newImage = image*real2+image2*real;
			ComplexNum result = new ComplexNum(newReal,newImage);
			return result;
		}
	
	public void print(){
			if(image!=0){
				System.out.println(real + " + " + image + "i");
			}
			else{
				System.out.println(real);
			}
		}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入第一个复数的实部和虚部：");
		Scanner input=new Scanner(System.in);
		double real=input.nextDouble();
		double image=input.nextDouble();
		ComplexNum num1=new ComplexNum(real,image);
		System.out.println("请输入第二个复数的实部和虚部：");
		real=input.nextDouble();
		image=input.nextDouble();
		ComplexNum num2=new ComplexNum(real,image);
		
		ComplexNum AddResult=num1.add(num2);
		System.out.print("相加后的结果： ");
		AddResult.print();
		System.out.println();
		
		ComplexNum SubResult=num1.sub(num2);
		System.out.print("相减后的结果： ");
		SubResult.print();
		System.out.println();	
		
		ComplexNum MulResult=num1.mul(num2);
		System.out.print("相乘后的结果： ");
		MulResult.print();
		System.out.println();

		
		
		

	}

}
