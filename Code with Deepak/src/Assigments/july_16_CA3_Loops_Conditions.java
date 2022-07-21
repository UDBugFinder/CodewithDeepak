package Assigments;
import java.util.Scanner;

public class july_16_CA3_Loops_Conditions {
public static void main(String[] args) {
	System.out.println("Please enter the number ");
	Scanner p=new Scanner(System.in);

	long x, count=0;
	x=p.nextLong();
	for(long i=1; i<=x; i++)
	{
		if (x%i==0)
		{
			count++;
		}
	}
	if (count==2)
	{
		System.out.println(x + " is Prime no" );
	}
	else
	{
		System.out.println(x + " is not a Prime no");
	}
}

	

}
