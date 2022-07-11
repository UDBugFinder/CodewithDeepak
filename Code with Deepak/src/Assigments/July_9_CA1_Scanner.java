package Assigments;
import java.util.Scanner;

public class July_9_CA1_Scanner {

	public static void main(String[] args) {
		System.out.println("Lets do the quick Problem!!");
		Scanner ob=new Scanner(System.in);
		System.out.println("Please enter the value x1 ");
		float x1=ob.nextFloat();
		System.out.println("Please enter the value x2 ");
		float x2=ob.nextFloat();
		System.out.println("Please enter the value x3 ");
		float x3=ob.nextFloat();
		System.out.println("Please enter the value x4 ");
		float x4=ob.nextFloat();
		System.out.println("Please enter the value x5 ");
		float x5=ob.nextFloat();
		System.out.println("Please enter the value x6 ");
		float x6=ob.nextFloat();
		float sum=x1 +x2 +x3;
		System.out.println("Here is the sum total : " + sum);
		
		float Sub= sum-x4;
		System.out.println("The subtraction result is : "+ Sub);
		
		float mult= Sub*x5;
		System.out.println("The Multiplication : "+mult);
		
		float Div= mult/x6;
		System.out.println("The Net result is : "+ Div);
		
		
		
	}

}
