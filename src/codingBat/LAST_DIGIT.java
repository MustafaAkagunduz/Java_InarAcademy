package codingBat;
import java.util.Scanner;
public class LAST_DIGIT {

	public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Please enter two values: ");
	int v1=scn.nextInt();
	int v2=scn.nextInt();
	
		if (v1 % 10 == v2 % 10) { System.out.println(true);
	    } else System.out.println(false);

		
	scn.close();
	}
	
}