package chapters.Chapter5;

import java.util.Scanner;

public class C5_E21 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Loan amount: ");
		double loanAmount = scn.nextDouble();
		System.out.println("Number of years: ");
		double numOfYears = scn.nextDouble();

		System.out.println("Interest Rate\tMonthly Payment\t\tTotal Payment");

		for (double intRate = 5; intRate <= 8; intRate += 0.125) {
			double monthlyInterest = intRate / 1200;

			double monthlyPayment = loanAmount * monthlyInterest / (1 - (1 / Math.pow(1 + monthlyInterest, numOfYears * 12)));
			monthlyPayment = (int) (monthlyPayment * 100) / 100.0;

			double totalPayment = monthlyPayment * numOfYears * 12;
			totalPayment = (int) (totalPayment * 100) / 100.0;
			System.out.println(intRate + "%\t\t" + monthlyPayment + "\t\t\t" + totalPayment);

		}

		scn.close();
	}

}
