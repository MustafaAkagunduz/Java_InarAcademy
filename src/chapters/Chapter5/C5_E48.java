package chapters.Chapter5;

import java.util.Scanner;

public class C5_E48 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = scn.nextLine();
		String result = "";

		for (int i = 0; i < str.length(); i += 2) {

			result += str.charAt(i);

		}
		System.out.println(result);

		scn.close();
	}

}
