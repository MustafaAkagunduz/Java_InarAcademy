package chapters.Chapter5;

import java.util.Scanner;

public class C5_E02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String output = "";
		int counter = 10;
		int numOfCorrects = 0, numOfErrors = 0;
		int v1, v2, input;
		long startTime = System.currentTimeMillis();
		while (counter >= 1) {
			v1 = (int) (Math.random() * 15);
			v2 = (int) (Math.random() * 15);

			System.out.println("What is " + v1 + " - " + v2 + " ?");
			input = scn.nextInt();

			if (input == v1 - v2) {
				System.out.println("You are correct!");
				numOfCorrects++;
			} else if (input != v1 - v2) {
				System.out.println("You are wrong!");
				numOfErrors++;
			}

			counter--;
			if (v1 - v2 == input) {
				output += "\n" + v1 + " - " + v2 + " = " + input + " correct!";
			} else
				output += "\n" + v1 + " - " + v2 + " = " + input + " false!";

		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		testTime /= 1000;

		System.out.println("Correct count is " + numOfCorrects + " \nErros count is: " +numOfErrors+ " \nTest time is " + testTime + " seconds");
		System.out.println(output);
		scn.close();
	}

}
