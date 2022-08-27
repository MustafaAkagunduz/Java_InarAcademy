package chapters.Chapter3;
import java.util.Scanner;
public class C3_E12 {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
	
	int userInput=0;
	boolean isPalindrome=false;
	
	System.out.println("Enter a three digit integer: ");
	userInput=scn.nextInt();
	
	int firstDigit= userInput/100;
	int lastDigit= userInput%10;
	
	if(firstDigit==lastDigit) {isPalindrome=true;}
	
	if(isPalindrome==true) {
			System.out.println(userInput+" is a palindrome");
	
	} else System.out.println(userInput+" is not a palindrome");
	
	scn.close();

	}

}
