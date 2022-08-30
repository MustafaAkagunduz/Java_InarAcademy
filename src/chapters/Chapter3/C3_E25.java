package chapters.Chapter3;

import java.util.Scanner;

public class C3_E25 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = scn.nextDouble();
		double y1 = scn.nextDouble();
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		double x3 = scn.nextDouble();
		double y3 = scn.nextDouble();
		double x4 = scn.nextDouble();
		double y4 = scn.nextDouble();

		double m1 = (y2 - y1) / (x2 - x1);
		double m2 = (y4 - y3) / (x4 - x3);

		if (m1 != m2) {
			double xOfIntersection = ((m1 * x1) - (m2 * x3) + y3 - y1) / (m1 - m2);
			double yOfIntersection = (m1 * (xOfIntersection - x1) + y1 + m2 * (xOfIntersection - x3) + y3) / 2;
			System.out.println("The intersection point is at : " + xOfIntersection + " " + yOfIntersection);

		} else {
			System.out.println("Lines are parallel.");
		}
		scn.close();
	}

}
