package Assigments;

public class inhertSuper1 {
	public inhertSuper1()
	{
		this(11,22,33);
		System.out.println("Parent default parameterirzed");
	}
	public inhertSuper1(int a)
	{
		this(11,22);
		System.out.println("Parent one parameterirzed");
	}
	public inhertSuper1(int a, int b)
	{
		this(11,22,33,44);
		System.out.println("Parent two parameterirzed");
	}
	public inhertSuper1(int a, int b, int c)
	{
		System.out.println("Parent three parameterirzed");
	}
	public inhertSuper1(int a, int b, int c, int d)
	{
		this();
		System.out.println("Parent four parameterirzed");
	}

}
