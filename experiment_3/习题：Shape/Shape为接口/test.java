package project3;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] S=new Shape[100];
		Random r=new Random();
		
		
		//�������100��Բ�������Ρ������Լ��뾶���������߳�  ��������S
		int number;
		for(int i=0;i<100;i++) {
			number=r.nextInt(3);
			switch(number) {
			case 0:
				S[i]=new Circle(r.nextDouble()+r.nextInt(100));
				break;
			case 1:
				S[i]=new Rectangle(r.nextDouble()+r.nextInt(100),r.nextDouble()+r.nextInt(100));
				break;
			case 2:
				S[i]=new Square(r.nextDouble()+r.nextInt(100));
				break;
			default: 
				break;				
			}
		}
		
		//������鼰�������
		double sum=0;
		for(int i=0;i<100;i++) {
		System.out.println(S[i].toString());
		sum+=S[i].area();
		}
		
		System.out.println("�����Ϊ��"+sum);


	}

}
