package Assigments;
import java.util.Scanner;

public class July_16_Palindrome {
public static void main(String[] args) {
	System.out.println(" Please enter the number: ");
	int number, r, sum=0;
	
	Scanner sc=new Scanner(System.in);
	number= sc.nextInt();
	int oldNo = number;
	while(number>0)
	{
		r= number%10;
		sum=sum*10+r;
		number=number/10;
		
	}
	if (oldNo==sum)
	{
		System.out.println("Palindrome Number "+ oldNo);
	}
	else
	{
		System.out.println("Not a Plaindrome number "+ oldNo);
	}
}
}
