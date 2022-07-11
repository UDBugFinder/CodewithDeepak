package Assigments;

public class june_25_CA1
{
	public june_25_CA1()
	{
		this(11, 22, 33);
		System.out.println("Default Constructor");
	}
	public june_25_CA1(int a) 
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
		
	public june_25_CA1(int a, int b) 
	{
		this(11);
		System.out.println("Two Parameterized Constructor");
	}
	public june_25_CA1(int a, int b, int c) 
	{
		
		System.out.println("Three Parameterized Constructor");
	}
	public june_25_CA1(int a, int b, int c, int d) 
	{
		this(11, 22);
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		june_25_CA1 obj=new june_25_CA1(11, 22, 33, 44);
	}
	

}
