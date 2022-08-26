package chapters.Chapter2;
import java.util.Scanner;

public class C2E1{
	public static void main(String[]args){
		Scanner scn= new Scanner(System.in);

		double celsius=0, fahrenheit=0;

		System.out.println("Enter a celcius degree: "); //gets celsius from the user
		celsius=scn.nextDouble();
		fahrenheit=(double) (9.0/5) * celsius + 32; //converts celsius to fahrenheit;
		
		System.out.println(celsius+ " Celsius is " + fahrenheit + " Fahrenheit");
		scn.close();
	}
}
