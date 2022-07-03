package Assigments;

public class inhertSuper2 extends inhertSuper1
{
	public inhertSuper2()
	{
		this(11,22);
		System.out.println("Child default parameterirzed");
	}
	public inhertSuper2(int a)
	{
		this(11,22,33,44);
		System.out.println("child one parameterirzed");
	}
	public inhertSuper2(int a, int b)
	{
		super(a);
		System.out.println("child two parameterirzed");
	}
	public inhertSuper2(int a, int b, int c)
	{
		this();
		System.out.println("child three parameterirzed");
	}
	public inhertSuper2(int a, int b, int c, int d)
	{
		this(11,22,33);
		System.out.println("child four parameterirzed");
	}
	public static void main(String[] args) 
	{
		inhertSuper2 s=new inhertSuper2(34);
	}
	
}



