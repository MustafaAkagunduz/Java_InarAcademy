package weeks.week_04;

import java.util.Scanner;

//decides whether input is palindrome word or not...

public class InterviewQuestion3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isPalindrome = true;
		System.out.println("Please enter the word: ");
		String str = scn.next();

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				isPalindrome = false;

		}
		System.out.println("The word " + str + " is palindrome: " + isPalindrome);
		scn.close();
	}
}
