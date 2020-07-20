package project2;
import java.util.Random;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] S=new Shape[100];
		Random r=new Random();
		
		//随机生成100个圆、正方形、矩形放入数组S
				int number;
				for(int i=0;i<100;i++) {
					number=r.nextInt(3);
					switch(number) {
					case 0:
						S[i]=new Circle();
						break;
					case 1:
						S[i]=new Rectangle();
						break;
					case 2:
						S[i]=new Square();
						break;
					default: 
						break;
							
					}
				}
				
				//随机生成半径、边长、长和宽
				for(int i=0;i<100;i++) {
					if(S[i] instanceof Circle) {
						Circle c=(Circle)S[i];
						c.getR(r.nextInt(100)+r.nextDouble());
					}
					if(S[i] instanceof Rectangle) {
						Rectangle Rec=(Rectangle)S[i];
						Rec.getLW(r.nextDouble()+r.nextInt(100), r.nextDouble()+r.nextInt(100));
					}
					if(S[i] instanceof Square) {
						Square SQ=(Square)S[i];
						SQ.getSide(r.nextDouble()+r.nextInt(100));
					}
					
				}
				
				
		//输出数组及总面积和
		double sum=0;
		for(int i=0;i<100;i++) {
			System.out.println(S[i].toString());
			sum+=S[i].area();
		}
		
		System.out.println("总面积为："+sum);


		
	}

}
