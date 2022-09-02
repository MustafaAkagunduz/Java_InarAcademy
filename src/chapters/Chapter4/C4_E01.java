package chapters.Chapter4;

import java.util.Scanner;

public class C4_E01 {

	public static void main(String[] args) {

		// THIS PROGRAM COMPUTES THE AREA OF A PENTAGON..

		Scanner scn = new Scanner(System.in);

		System.out.println("Please input the value-r: (from center to vertex)");
		double r = scn.nextDouble();

		double side = 2 * r * Math.sin(Math.PI / 5);

		double area = (5 * side * side / 4) / (4 * Math.tan(Math.PI / 5));
		area = (int) (area * 100) / 100.0; // Formatting..

		System.out.println("The area of the pentagon is: " + area);

		scn.close();

	}

}
