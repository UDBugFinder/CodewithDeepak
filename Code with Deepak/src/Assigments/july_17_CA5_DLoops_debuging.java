package Assigments;

public class july_17_CA5_DLoops_debuging {

	public static void main(String[] args) {
		int rowcount=5;
		for(int i=1; i<=rowcount; i++)
		
		{
			for(int j=1; j<=rowcount-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k=k+1)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
