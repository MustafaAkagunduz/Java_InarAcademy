package chapters.Chapter2;
import java.util.Scanner;
public class C2E3{
	public static void main(String[]args){
	
	//This code converts feet into meter.

	double feet=0.0, meters=0.0;
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter a value for feet:" );
	feet=scn.nextDouble(); 			//gets the feet
	meters= feet* (305/1000); 		//related calculation

	System.out.println(feet+ " feet is "+ meters+ " meters. ");
	scn.close();
	}
}
