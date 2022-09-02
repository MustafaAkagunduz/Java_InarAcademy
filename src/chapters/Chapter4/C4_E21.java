package chapters.Chapter4;

import java.util.Scanner;

public class C4_E21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a SSN(Format: DDD-DD-DDDD): ");
		String SSN = scn.nextLine();

		try {
			if (SSN.substring(0, 3).length() == 3 && SSN.substring(4, 6).length() == 2
					&& SSN.substring(7, 11).length() == 4) {
				System.out.println(SSN + " is a valid social security number");
			} else
				System.out.println(SSN + " is an invalid social security number");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of the program");

		scn.close();

	}

}
