package chapters.Chapter6;

import java.util.Scanner;

public class C6_E02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scn.nextInt();
		System.out.println("Sum of the digits is: " + sumDigits(number));

		scn.close();

	}

	public static int sumDigits(int number) {

		int sum = 0;

		while (number != 0) {

			sum += number % 10;
			number /= 10;

		}

		return sum;

	}

}
