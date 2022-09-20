package chapters.Chapter5;

import java.util.Scanner;

public class C5_E45 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		double[] numbers = new double[10];
		System.out.println("Enter ten numbers: ");
		double num = 0, sum = 0, avg, std;

		for (int i = 1; i <= 10; i++) {
			num = scn.nextDouble();
			numbers[i - 1] = num;
			sum += num;
		}
		avg = sum / 10;

		double temp = 0;

		for (double a : numbers) {
			temp += Math.pow(a - avg, 2);
		}
		std = Math.sqrt(temp / 9); // n-1

		System.out.println("The mean is: " + avg);
		System.out.print("The standart deviation is: ");
		System.out.printf("%.5f", std);

		scn.close();
	}

}


