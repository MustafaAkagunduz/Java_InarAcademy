package chapters.Chapter3;
import java.util.Scanner;
public class C3_E14 {

	public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);	
		
	int coin=(int)(Math.random()*2);
	
	System.out.println("Welcome to heads/tails game!:");
	System.out.println("Please enter your guess(0 for heads/ 1 for tails):  ");
	int guess=scn.nextInt();
	
	if(guess==coin) {
		System.out.println("Congratulations");
		
		
	} else System.out.println("Maybe next time");

	scn.close();
	}

}
