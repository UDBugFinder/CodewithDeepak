package Assigments;
import java.util.Scanner;

public class july_16_CA5_Loops_Conditions {
	public static void main(String[] args) {
		int x, i, fact = 1;
		Scanner tab=new Scanner(System.in);		
		System.out.println("Please Enter the Number");
		x=tab.nextInt();
		for( i=1; i<=x; i++)
		{
			fact=fact*i;
		
		}
		System.out.println("Factorial is " + fact);
}}
