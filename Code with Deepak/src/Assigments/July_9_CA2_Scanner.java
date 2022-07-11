package Assigments;
import java.util.Scanner;


public class July_9_CA2_Scanner {


	public static void main(String[] args) {
		System.out.println("Lets do the quick Problem :)");
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
		
		float mult= x1*x2;
		System.out.println("The Multiplication : "+ mult);
		
		float Sub= mult-x3;
		System.out.println("The subtraction result is : "+ Sub);
		
		float sum= Sub + x4;
		System.out.println("Here is the sum total : " + sum);
		
		float Sub2= sum + x5;
		System.out.println("Here is the Sub total : " + sum);
		
		float Div= Sub2/x6;
		
		System.out.println("The Division result is : "+ Div);
		System.out.println("The final result  " + Math.round(Div));
		
		
	}

}


