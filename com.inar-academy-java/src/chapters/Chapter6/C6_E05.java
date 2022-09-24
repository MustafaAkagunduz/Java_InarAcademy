package chapters.Chapter6;

import java.util.Scanner;

public class C6_E05 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter three numbers: ");
		double n1 = scn.nextDouble();
		double n2 = scn.nextDouble();
		double n3 = scn.nextDouble();

		System.out.print("Numbers sorted: ");
		displaySortedNumbers(n1, n2, n3);

		scn.close();
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double max=0, mid=0, min=0;

		if (num1 > num2 && num1 > num3) {
			max = num1;

			if (num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}

		}
		
		if (num2 > num3 && num2 > num1) {
			max = num2;

			if (num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}

		}
		
		if (num3 > num1 && num3 > num2) {
			max = num3;

			if (num2 > num1) {
				mid = num2;
				min = num1;
			} else {
				mid = num1;
				min = num2;
			}

		}

		System.out.println(max + " - " + mid + " - " + min);
	}
}
