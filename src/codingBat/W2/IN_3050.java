package codingBat.W2;
import java.util.Scanner;
public class IN_3050 {

	public static void main(String[] args) {

	int a=0, b=0;	
	Scanner scn=new Scanner(System.in);

	System.out.println("Please enter two values: ");
	a=scn.nextInt();
	b=scn.nextInt();
	
	if (a >= 30 && a <= 40 && b >= 30 && b <= 40) { System.out.println(true); }
	
	if (a >= 40 && a <= 50 && b >= 40 && b <= 50) { System.out.println(true); }
	else System.out.println(false);
	
	
	scn.close();
	}
	
}
