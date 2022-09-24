package chapters.Chapter5;

import java.util.Scanner;

public class C5_E30 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the amount you save each month: ");
		double savingMonthly = scn.nextDouble();

		System.out.println("Please enter the annual interest rate(5 for %5): ");
		double annualInterestRate = scn.nextDouble();
		double monthlyInterestRate = annualInterestRate / 100;

		System.out.println("Please enter how many months you save: ");
		double numOfMonths = scn.nextDouble();

		double total = 0;

		for (int i = 1; i <= numOfMonths; i++) {

			total = (savingMonthly + total) * (1 + monthlyInterestRate / 12);

		}
		System.out.println();
		System.out.print("After the " + numOfMonths + " month(s), the total value is ");
		System.out.printf("%.3f", total);

		scn.close();
	}

}
