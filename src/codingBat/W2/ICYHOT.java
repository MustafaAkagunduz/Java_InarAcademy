package codingBat.W2;
import java.util.Scanner;
public class ICYHOT {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first temperature: ");
		int temp1=scn.nextInt();
		
		System.out.println("Enter second temperature: ");
		int temp2=scn.nextInt();
		
		
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
		    System.out.println(true);
		  } else 
		    System.out.println(false);
		
		scn.close();
		  

	}

}
