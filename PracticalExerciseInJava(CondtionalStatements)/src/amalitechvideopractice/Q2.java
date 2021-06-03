package amalitechvideopractice;

import java.util.Scanner;

/*
 * 2.	Check if the nth power of a number is even or not (take the number and power as input)
 */
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int number;
	int exponent;
	double result;
	
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter The Number: ");
	number=in.nextInt();
    
	  System.out.println("Enter The Exponent: ");
    exponent=in.nextInt();
  
    
     result=Math.pow(number, exponent);
     in.close();
     
     if (result%2==0)
     {
    	 System.out.println("result is even");
     }
     else {
    	 System.out.println("result is odd");
     }
     
	}


	

}
