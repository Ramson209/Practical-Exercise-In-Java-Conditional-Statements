package amalitechvideopractice;

import java.util.Scanner;

/*
 * 4.	Check if the alphabeth	 entered 	by the user is an uppercase character or a lower case character.
 */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your character : ");
		
		 ch =in.next().charAt(0);
		 in.close();
		
		int ascii=(int)ch;
		
		if (ascii >=65 && ascii<=90) {
			System.out.println("Upper case letter");
		}
		else if(ascii>=97 && ascii<=122)
		{
			System.out.println("Lower case letter");
		}
		else {
			System.out.println("The character is not an alphabeth");
		}
	}

}
