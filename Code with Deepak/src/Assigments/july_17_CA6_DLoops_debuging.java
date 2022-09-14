package Assigments;

public class july_17_CA6_DLoops_debuging {


	public static void main(String[] args) {
		
		int count=0;
		for(int i=1; i<=5; i++)
		
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k=k+1)
			{
				
			System.out.print("*");
			
			}
			System.out.println();
		}
	}


}
