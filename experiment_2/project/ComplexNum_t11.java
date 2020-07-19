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
	
	
	//���
	public ComplexNum add(ComplexNum c){ 
			double real2 = c.getReal();
			double image2 = c.getImage();
			double newReal = real + real2;
			double newImage = image + image2;
			ComplexNum result = new ComplexNum(newReal,newImage);
			return result;
		}
	
	//���
	public ComplexNum sub(ComplexNum c){
			double real2 = c.getReal();
			double image2 = c.getImage();
			double newReal = real - real2;
			double newImage = image - image2;
			ComplexNum result = new ComplexNum(newReal,newImage);
			return result;
		}
		
	//���
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
		System.out.println("�������һ��������ʵ�����鲿��");
		Scanner input=new Scanner(System.in);
		double real=input.nextDouble();
		double image=input.nextDouble();
		ComplexNum num1=new ComplexNum(real,image);
		System.out.println("������ڶ���������ʵ�����鲿��");
		real=input.nextDouble();
		image=input.nextDouble();
		ComplexNum num2=new ComplexNum(real,image);
		
		ComplexNum AddResult=num1.add(num2);
		System.out.print("��Ӻ�Ľ���� ");
		AddResult.print();
		System.out.println();
		
		ComplexNum SubResult=num1.sub(num2);
		System.out.print("�����Ľ���� ");
		SubResult.print();
		System.out.println();	
		
		ComplexNum MulResult=num1.mul(num2);
		System.out.print("��˺�Ľ���� ");
		MulResult.print();
		System.out.println();

		
		
		

	}

}
