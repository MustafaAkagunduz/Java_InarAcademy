package weeks.week_03;
import java.util.Scanner;
public class Assignment03 {

	public static void main(String[] args) {
		/*Question 3
		A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
		INPUT : 1234        OUTPUT : 4321
		INPUT : 5982        OUTPUT : 2895*/
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a 4-digit number: ");
		int number= scn.nextInt(); 
		
		System.out.print("Your input is: "+ number+ " and reverse of this number is: ");
		
		while(number!=0) {
			System.out.print(number%10);
			number/=10;
			
		}
		System.out.println();
		System.out.println("End of the program..");
		scn.close();
	}

}
