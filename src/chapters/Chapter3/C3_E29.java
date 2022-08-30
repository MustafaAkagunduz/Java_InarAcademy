package chapters.Chapter3;

import java.util.Scanner;

public class C3_E29 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first circles center x-, y-coordinates, and radius: ");
		double x1 = scn.nextInt();
		double y1 = scn.nextInt();
		double r1 = scn.nextInt();
		System.out.println("Enter second circle's center x-, y-coordinates, and radius: ");
		double x2 = scn.nextInt();
		double y2 = scn.nextInt();
		double r2 = scn.nextInt();

		double distanceBetweenTwoCircle = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

		if (distanceBetweenTwoCircle <= Math.abs(r1 - r2)) {
			System.out.println("Second Circle is in the first circle..");
		} else if (distanceBetweenTwoCircle <= r1 + r2) {
			System.out.println("Second Circle overlaps the first one..");
		} else System.out.println("Second Circle doesn't overlap the first one...");

		scn.close();
	}

}
