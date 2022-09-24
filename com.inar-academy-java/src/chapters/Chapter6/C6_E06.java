package chapters.Chapter6;

import java.util.Scanner;

/*(Display patterns) Write a method to display a pattern as follows:
1
2 1
3 2 1
...
n n-1 ... 3 2 1
The method header is
public static void displayPattern(int n)*/

public class C6_E06 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an n value: ");
		int n = scn.nextInt();

		displayPattern(n);

		scn.close();

	}

	public static void displayPattern(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {

				System.out.print(k);

			}
			System.out.println();
		}

	}

}
