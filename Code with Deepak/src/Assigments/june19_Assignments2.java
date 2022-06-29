package Assigments;

public class june19_Assignments2
{
	public int div(int a1, int a2)
	{
		 int a3;
		 a3=a1/a2;
		 System.out.println("the div result is " + a3);
		 return a3;
	}
	public int sub(int b1, int b2)
	{
		int b3;
		b3=b1-b2;
		System.out.println("The sub result is " + b3);
		return b3;
		
	}
	public int sub2(int c1, int c2)
	{
		int c3;
		c3=c1-c2;
		System.out.println("The Sub result is " + c3);
		return c3;
	}
	public int sum(int d1, int d2)
	{
		int d3;
		d3=d1+d2;
		System.out.println("The Sum result is " + d3);
		return d3;
	}
	public void mult(int x1, int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("The net result is " + x3);
	}
	public static void main(String[] args)
	{
		june19_Assignments2 sc=new june19_Assignments2();
		int div = sc.div(10, 2);
		int sub = sc.sub(div, 2);
		int sub2 = sc.sub2(sub, 2);
		int sum = sc.sum(sub2, 2);
		sc.mult(sum, 2);
		
		System.out.println("We did it");
		
		
	}
}
