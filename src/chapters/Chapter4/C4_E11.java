package chapters.Chapter4;
import java.util.Scanner;
public class C4_E11 {

	public static void main(String[] args) {
	
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter a decimal value (0 to 15): ");
	int decimal=scn.nextInt();
	
	if(decimal>15 && decimal <0) {System.out.println("Invalid input...");
	}else  System.out.println("Valid input");
	
	switch (decimal) {
		case 0:  System.out.println("The hex value is: 0");	break;
		case 1:  System.out.println("The hex value is: 1");	break;
		case 2:  System.out.println("The hex value is: 2");	break;
		case 3:  System.out.println("The hex value is: 3");	break;
		case 4:  System.out.println("The hex value is: 4");	break;
		case 5:  System.out.println("The hex value is: 5");	break;
		case 6:  System.out.println("The hex value is: 6");	break;
		case 7:  System.out.println("The hex value is: 7");	break;
		case 8:  System.out.println("The hex value is: 8");	break;
		case 9:  System.out.println("The hex value is: 9");	break;
		case 10: System.out.println("The hex value is: A");	break;
		case 11: System.out.println("The hex value is: B");	break;
		case 12: System.out.println("The hex value is: C");	break;
		case 13: System.out.println("The hex value is: D");	break;
		case 14: System.out.println("The hex value is: E");	break;
		case 15: System.out.println("The hex value is: F");	break;
		default: System.out.println("Invalid input...");	break;
	}	
	
	scn.close();
		
	}

}
