package chapters.Chapter5;

import java.util.Scanner;

public class C5_E01 {

	public static void main(String[] args) {
		int input, positives = 0, negatives = 0, counter = 0;
		double avg = 0.0, sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");

		do {

			input = scn.nextInt();
			if (input == 0) {
				break;
			}
			sum += input;
			if (input > 0) {
				positives++;
			} else
				negatives++;

			counter++;

		} while (input != 0);

		avg = sum / counter;

		System.out.println("The number of positives is: " + positives);
		System.out.println("The number of negatives is: " + negatives);
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + avg);

		scn.close();

	}

}
