package codingBat;
import java.util.Scanner;
public class PARROT_TROUBLE {

	public static void main(String[] args) {
		boolean isTalking=true;
		Scanner scn=new Scanner(System.in);
		System.out.println("PLEASE ENTER THE HOUR: ");
		int hour=scn.nextInt();
		
		if(isTalking && (hour < 7 || hour > 20)) {System.out.println("WE HAVE A PROBLEM");}
		else System.out.println("NO PROBLEM...");
		
		scn.close();
		

	}

}
