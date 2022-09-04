package chapters.Chapter4;

import java.util.Scanner;

public class C4_E26 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter the amount (for example 89.59): "); //We get the amount
		String amountString = scn.nextLine();
		
		String numberOfOneDollars = amountString.substring(0, amountString.indexOf(".")); 
		//The indexOf() method returns the position of the first occurrence of specified character(s) in a string.

		String cents = amountString.substring(amountString.indexOf(".") + 1);
		int intCents = Integer.parseInt(cents);
		
		//Logic of the question
		int numOfQuarters = intCents  / 25;  intCents %= 25;
		int numOfDimes =    intCents  / 10;  intCents %= 10;
		int numOfNickels = intCents   / 5;   intCents %= 5;
		int numOfPennies = intCents;

		String quarters = numOfQuarters+"";
		String dimes 	= numOfDimes+"";
		String nickels  = numOfNickels+"";
		String pennies  = numOfPennies+"";

		//results...
		System.out.println(amountString + " is" );
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + quarters + " quarters ");
		System.out.println(" " + dimes + " dimes");
		System.out.println(" " + nickels + " nickels");
		System.out.println(" " + pennies + " pennies");

		
		scn.close();
	}

}
