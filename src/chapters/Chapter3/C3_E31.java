package chapters.Chapter3;
import java.util.Scanner;
public class C3_E31 {

	public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	int preference;
	double userInput=0.0, result=0.0;
	System.out.println("Enter the exchange rate from dollars to RMB: ");
	double excRate=scn.nextDouble();
	
	
	System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	preference=scn.nextInt();
	
	if(preference==0) { System.out.println("Enter the dollar amount: ");
						userInput=scn.nextDouble();
						result= userInput*excRate;
						System.out.println("$"+userInput+ " is "+ result + " yuan ");
	}else if(preference==1) { System.out.println("Enter the RMB amount: ");
							 userInput=scn.nextDouble();
							 result=userInput/excRate;
							 System.out.println(userInput+ " yuan is $"+ result);
	}else if(preference!=0 || preference!=1) {System.out.println("Incorrect input");}
	
	
	
	}

}
