package chapters.Chapter6;

import java.util.Scanner;

public class C6_E19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double area = 0.0;
		System.out.println("Please enter the sides of the triangle: ");
		double s1 = scn.nextDouble();
		double s2 = scn.nextDouble();
		double s3 = scn.nextDouble();

		area = area(s1, s2, s3);

		boolean isValid = isValid(s1, s2, s3);
		if (isValid == false) {
			System.out.println("Triangle is invalid..");
		} else
			System.out.println("Triangle is valid..");

		System.out.println("Area of the triangle is: " + area);

		scn.close();
	}

	public static boolean isValid(double side1, double side2, double side3) {

		boolean isValid = false;

		if (side1 + side2 > side3)
			isValid = true;
		else if (side3 + side2 > side1)
			isValid = true;
		else if (side1 + side3 > side2)
			isValid = true;

		return isValid;
	}

	public static double area(double side1, double side2, double side3) {
		double area = 0;
		double s = (side1 + side2 + side3) / 2;
		area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

		return area;

	}
}
