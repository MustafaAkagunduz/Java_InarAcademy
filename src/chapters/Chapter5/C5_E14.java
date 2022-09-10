package chapters.Chapter5;

import java.util.Scanner;

public class C5_E14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int greatestCommonDivisor = 1;
		
		System.out.println("Please enter the first value: ");
		int v1 = scn.nextInt();
		System.out.println("Please enter the second value: ");
		int v2 = scn.nextInt();

		greatestCommonDivisor = Math.min(v1, v2);

		while (v1 % greatestCommonDivisor != 0 || v2 % greatestCommonDivisor != 0) {
			greatestCommonDivisor--;
		}

		System.out.println("The biggest common divisor of " + v1 + " and " + v2 + " is " + greatestCommonDivisor);
		scn.close();
	}

}





