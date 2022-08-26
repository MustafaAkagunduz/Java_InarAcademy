package chapters.Chapter2;
import java.util.Scanner;
public class C2E5{
	public static void main(String[]args){
	
	//this code computes the gratuity and total

	Scanner scn= new Scanner(System.in);
	double subtotal=0.0, gratuityRate=0.0; //variables to be gotten from the user.
	double gratuity=0.0, total=0.0; //variables to be computed by developer
	System.out.println("Please enter the subtotal: ");
	subtotal= scn.nextDouble();
	System.out.println("Please enter the gratuity rate: ");
	gratuityRate=scn.nextDouble();

	//required computations:
	gratuity=subtotal* gratuityRate/100;
	total= gratuity+subtotal;
	
	//output of results
	System.out.println("The gratuity is: $"+gratuity+ " and total is: $"+ total); 
	scn.close();
	}
}