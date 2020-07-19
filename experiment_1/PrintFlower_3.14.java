package my_project;

public class PrintFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		System.out.println("100~1000中所有的“水仙花数”是：");
		for(int i=100;i<1000;i++)
		{
			x=i/100;
			y=(i%100)/10;
			z=(i%100)%10;
			if(x*x*x+y*y*y+z*z*z==i)
				System.out.print(i+" ");
		}


	}

}
