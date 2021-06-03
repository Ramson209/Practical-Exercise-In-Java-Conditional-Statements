package amalitechvideopractice;

import java.util.Scanner;

/*
 * 3.	Check if a triangle is a right angel triangle or isosceles triangle.
 */
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub right angles have three side or thats why three integers were used 
        int a;
        int b;
        int c;
        
        Scanner in=new Scanner(System.in);
        
       System.out.print("Enter the first side: ");
       
       a=in.nextInt();
       
       System.out.print("Enter the second side: ");
       
       b=in.nextInt();
       
       System.out.print("Enter the third side: ");
       
       c=in.nextInt();
       
       in.close();
       
       //check if the triangle is right angled triangle
       
       if (c==Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)))
       {
    	   System.out.println("The triangle is right angled");
       }
       //check if the triangle is isoceles triangle
       
       if (a==b || b==c || a==c)
       {
    	   System.out.println("The Triangle is isoceles");
    	   
       }
       else {
    	   System.out.println("The triangle is not of know type");
       }
	}

}
