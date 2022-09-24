package chapters.Chapter5;

import java.util.Scanner;

public class C5_E51 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String common="";
		System.out.println("Please enter two strings: ");
		System.out.println("String-1: ");
		String str1 = scn.nextLine();
		System.out.println("String-2: ");
		String str2 = scn.nextLine();

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				//String char= Character.toString(s)
				common += str1.charAt(i);
			}
		}
		if (common.length() != 0) {
			System.out.println("Largest common prefix is: " + common);
		} else System.out.println(str1 + " and " + str2 + " has no common prefix...");
		
		scn.close();
	}
}
