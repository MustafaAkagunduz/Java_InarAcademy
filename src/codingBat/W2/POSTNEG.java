package codingBat.W2;
import java.util.Scanner;
public class POSTNEG {

	public static void main(String[] args) {
	boolean isNegative=false;
	Scanner scn=new Scanner(System.in);
	
	System.out.println("PLEASE ENTER TWO VALUE:");
	int v1=scn.nextInt();
	int v2=scn.nextInt();
	
	if(isNegative) { System.out.println("EXPRESSION ONE IS NEGATIVE OTHER IS POSITIVE: "+  (v1< 0 && v2 < 0));    } 
	else System.out.println("EXPRESSION ONE IS NEGATIVE OTHER IS POSITIVE: "+  ((v1 < 0 && v2 > 0) || (v1 > 0 && v2 < 0)));
	
	scn.close();

	}

}

