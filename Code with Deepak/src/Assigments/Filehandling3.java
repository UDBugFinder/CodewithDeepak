package Assigments;

import java.util.Scanner;

public class Filehandling3 

{ 
	

		public static void main(String[] args) {
			System.out.println("Please enter the number ");
			Scanner p=new Scanner(System.in);
			
			int number ;
			number=p.nextInt();
			int sum=0;
			int oldNo = number;
			while (number>0)
			{
				int r=number%10;
				sum = sum *10+r;
				number=number/10;
			}
			{
				System.out.println(" Palindrome number " + oldNo);
			}
			else
			{
				System.out.println(" Not a Plaindrome number" + oldNo);
			}
			}
			


	}