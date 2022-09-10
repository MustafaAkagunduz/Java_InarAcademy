package chapters.Chapter5;

import java.util.Scanner;

public class C5_E16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int i = scn.nextInt();
		int divider = 2;

		while (i > 0) {

			if (i % divider == 0) {
				System.out.print(divider + " ");
				i /= divider;
			} else
				divider++;

		} scn.close();

	}

}
