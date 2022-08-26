package chapters.Chapter2;
import java.util.Scanner;
public class C2E7{
	public static void main(String[]args){

	Scanner scn= new Scanner(System.in);	
	
	System.out.println("Enter the number of minutes: ");
	int minutes=scn.nextInt(); //User input

	//We assume 1 year is 12 months, 1 month is 30 days
	//1 day is 24 hours and 1 hour is 60 minutes
	int year= 		minutes/60/24/365;	//required computation.
	int extraDays= 		minutes/60/24%365;	//required computation.

	System.out.println(minutes + " minutes are " + year + " years and " + extraDays + " days");



	scn.close();
	}


}