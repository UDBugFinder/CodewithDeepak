package Assigments;

public class June19_Assignments 
{
	public int sum(int a1, int a2)
	{int a3;
	a3=a1+a2;
	System.out.println("Sum result is " + a3);
	return a3;
	}
	public int sum2(int b1, int b2)
	{
		int b3;
		b3=b1+b2;
		System.out.println("Sum result is " + b3);
		return b3;
	
	}
	public int sub(int c1, int c2)
	{
		int c3;
		c3=c1-c2;
		System.out.println("Subtract result is " + c3);
		return c3;
	}
	public int mult( int x1, int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("Mult result is " + x3);
		return x3;
	}
	public void div (int y1, int y2)
	{
		int y3;
		y3=y1/y2;
		System.out.println("Net result is " + y3);
	}
	public static void main(String[] args) 
	{
		June19_Assignments sc=new June19_Assignments();
		int sum= sc.sum(10, 2);
		int sum2= sc.sum2(sum, 2);
		int sub= sc.sub(sum2, 2);
		int mult= sc.mult(sub, 2);
		sc.div(mult, 2);
		
		
	}
}
