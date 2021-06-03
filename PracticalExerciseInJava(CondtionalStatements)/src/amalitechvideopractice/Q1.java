package amalitechvideopractice;

import java.util.Scanner;

/*
 * 1.	A government wants to provide student loans to students in their country. But in-order for a student to be eligible to get a student loan, he/she must be in age range 17 to 21, must have a minimum of 80% score in academics. Write a program to accept the name, age and marks 	of a student and display if he/she is eligible for the loan or not.
 */
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		double marks;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your name ");
		 name=in.nextLine();
		 System.out.print("Enter your age ");
		 age=in.nextInt();
		 System.out.print("Enter your marks ");
		 marks=in.nextDouble();
		 in.close();
		 
		 if(age>=17 && age<=20)//condition 1
		 {
			 if(marks>=80) //condition 2
			 {
				 System.out.println(name+" is eligible");
			 }
			 
			 else {
				 System.out.println(name+" is not eligible");
			 }
		 }
		 else {
			 System.out.print(name+" is not eligible");
		 }

	}

}
