package Assigments;
import java.util.Scanner;

public class july_16_Armstrong {
	public static void main(String[] args) {
		System.out.println(" Please enter the Number: ");
		int number, sum=0;
		Scanner sc=new Scanner(System.in);
		number= sc.nextInt();
		int oldNo = number;
		while(number>0)
		{
			int r= number%10;
			sum= sum + r*r*r;
			number=number/10;
		}
		if (oldNo==sum)
		{
			System.out.println(oldNo + " is an Armstrong Number ");
		
		}
		else
		{
			System.out.println(oldNo + " is not an Armstrong number");
		}
	}

}
