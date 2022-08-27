package codingBat.W2;
import java.util.Scanner;

public class OR35 {

	public static void main(String[] args) {
		
		
	Scanner scn=new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int num=scn.nextInt();
	
	if((num % 3 == 0) || (num % 5 == 0)) { System.out.println("Number "+ num+ "can be divided 3 or 5");}
	else System.out.println("Number "+ num+ "can't be divided 3 or 5");

	
	scn.close();
	}

}
