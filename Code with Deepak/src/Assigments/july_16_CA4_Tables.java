package Assigments;
import java.util.Scanner;

public class july_16_CA4_Tables {
	public static void main(String[] args) {
		int x, i;
		Scanner tab=new Scanner(System.in);		
		System.out.println("Please Enter the Number");
		x=tab.nextInt();
		for( i=1; i<=10; i++)
		{
			System.out.println(x+"*"+ i +"="+x*i);
		}
		
		
	}

}
