package chapters.Chapter2;
import java.util.Scanner;

public class C2E6{
	public static void main(String[]args){

	Scanner scn= new Scanner(System.in);
		int rawNumber=0,copyNumber=0, sum=0;

		System.out.println("Enter the number to add digits");
		rawNumber=scn.nextInt(); //User input
		copyNumber=rawNumber;	//input is copied in order not to lose its value after the loop process.
			while(rawNumber>0){
			sum+=rawNumber%10;
			rawNumber=rawNumber/10;

			} //variable "rawNumber" is zero now..
		System.out.println("Your number is: "+ copyNumber);
		System.out.println("Sum of the digits is: "+ sum);
		scn.close();
	}
}