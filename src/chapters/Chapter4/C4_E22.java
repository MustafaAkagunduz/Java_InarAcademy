package chapters.Chapter4;
import java.util.Scanner;
public class C4_E22 {

	public static void main(String[] args) {
	
		/*(Check substring) Write a program that prompts the user to enter two strings and
		reports whether the second string is a substring of the first string.*/

		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter first String: ");
		String s1=scn.nextLine();
		System.out.println("Please enter second String: ");
		String s2=scn.nextLine();
		
		if(s1.contains(s2)) {				
			System.out.println(s2+ " is a substring of "+ s1);
		}
		
		
		
		scn.close();
	}

}
