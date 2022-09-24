package chapters.Chapter6;

import java.util.Random;
import java.util.Scanner;

public class C6_E17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a length of a matrix: ");
		int n = scn.nextInt();

		printMatrix(n);

		scn.close();

	}

	public static void printMatrix(int n) {

		Random rdm = new Random();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int a = rdm.nextInt(2);
				System.out.print(a + " ");

			}

			System.out.println();
		}

	}

}
