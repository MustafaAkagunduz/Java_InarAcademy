package chapters.Chapter4;

import java.util.Scanner;

public class C4_E02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the coordinates of the two points(latitude/longitude): ");
		System.out.println("X of the first: ");
		double x1 = scn.nextDouble();
		x1 = Math.toRadians(x1);
		System.out.println("Y of the first: ");
		double y1 = scn.nextDouble();
		y1 = Math.toRadians(y1);
		System.out.println("X of the second: ");
		double x2 = scn.nextDouble();
		x2 = Math.toRadians(x2);
		System.out.println("Y of the second: ");
		double y2 = scn.nextDouble();
		y2 = Math.toRadians(y2);

		double distance = 6371.01
				* (Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));

		System.out.println("The distance between the two points is: " + distance);
		scn.close();

	}

}
