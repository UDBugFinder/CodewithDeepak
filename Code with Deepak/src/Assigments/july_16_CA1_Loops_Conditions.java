package Assigments;

import java.util.Scanner; 

public class july_16_CA1_Loops_Conditions
{
	 
	  
	    public static void main(String[] args) {  
	      int x, y, z;
	      Scanner ob=new Scanner(System.in);
	      System.out.println("Enter the value of X ");
	       x= ob.nextInt();
	       System.out.println("Enter the value of Y ");
	       y= ob.nextInt();
	       System.out.println("Before swapping numbers "+ x +  "  "+   y +"");
	       z=x;
	       x=y;
	       y=z;
	      
	       
	      
	       System.out.println("After swapping " +  x+ " "  +   y);
	      
	      
	    }    
	}  
