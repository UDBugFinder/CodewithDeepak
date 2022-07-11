   package Assigments;

public class june_25_CA2 
{
	public void m()
	{
		this.m3();
		System.out.println("Default Parameterized");
	}
	public void m1() 
	{
		this.m();
		System.out.println("One Parameterized");
	}
		
	public void m2() 
	{
		this.m1();
		System.out.println("Second Parameterized");
	}
	public void m3() 
	{
		
		System.out.println("Third Parameterized");
	}
	public void m4() 
	{
		this.m2();
		System.out.println("Fourth Parameterized");
	}
	public static void main(String[] args) 
	{
		june_25_CA2 obj=new june_25_CA2();
		obj.m4();
	}
	
}
