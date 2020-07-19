package my_project;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0;i<5;i++)
			{
				for(j=0;j<=2*(i-1);j++)
				System.out.print(" ");
				for(k=0;k<5;k++)
				System.out.print("*  ");
				System.out.println();
			}
	}

}
