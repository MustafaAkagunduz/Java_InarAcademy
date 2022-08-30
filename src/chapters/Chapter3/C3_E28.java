package chapters.Chapter3;

import java.util.Scanner;

public class C3_E28 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// INFORMATION INPUTS OF FIRST RECTANGLE

		System.out.println("Please enter the center coordinates of first rectangle(axis x first, then axis y): ");
		double xFirst = scn.nextInt();
		double yFirst = scn.nextInt();
		System.out.println("Please enter the width of the first rectangle: ");
		double widthFirst = scn.nextInt();
		System.out.println("Please enter the height of the first rectangle: ");
		double heightFirst = scn.nextInt();

		System.out.println("Information about first rectangle: CENTER: " + xFirst + "," + yFirst + " //Width:"
				+ widthFirst + " Height:" + heightFirst);

		double xFinderRightFR = xFirst + (widthFirst / 2);
		double xFinderLeftFR = xFirst - (widthFirst / 2);
		double yFinderUpFR = yFirst + (heightFirst / 2);
		double yFinderDownFR = yFirst - (heightFirst / 2);

		System.out.println("Here is the rectangle first:");
		System.out.println("AXIS-X POINTS OF THE SECOND: " + xFinderLeftFR + " " + xFinderRightFR);
		System.out.println("AXIS-Y POINTS OF THE SECOND: " + yFinderUpFR + " " + yFinderDownFR);

		// INFORMATION INPUTS OF SECOND RECTANGLE

		System.out.println("Please enter the center coordinates of second rectangle(axis x first, then axis y): ");
		double xSecond = scn.nextInt();
		double ySecond = scn.nextInt();
		System.out.println("Please enter the width of the second rectangle: ");
		double widthSecond = scn.nextInt();
		System.out.println("Please enter the height of the second rectangle: ");
		double heightSecond = scn.nextInt();

		System.out.println("Information about second rectangle: CENTER: " + xSecond + "," + ySecond + " //Width:"
				+ widthSecond + " Height:" + heightSecond);

		double xFinderRightSR = xSecond + (widthSecond / 2);
		double xFinderLeftSR = xSecond - (widthSecond / 2);
		double yFinderUpSR = ySecond + (heightSecond / 2);
		double yFinderDownSR = ySecond - (heightSecond / 2);

		System.out.println("Here is the rectangle Second:");
		System.out.println("AXIS-X POINTS OF THE SECOND: " + xFinderLeftSR + " " + xFinderRightSR);
		System.out.println("AXIS-Y POINTS OF THE SECOND: " + yFinderUpSR + " " + yFinderDownSR);

		if (((yFinderUpFR > yFinderUpSR) && (yFinderDownFR < yFinderDownSR))
				&& ((xFinderRightFR > xFinderRightSR) && (xFinderLeftFR < xFinderLeftSR))) {
			System.out.println("The second rectangle is inside the first rectangle...");
		} else
			System.out.println("Second rectangle is not in the first one..");

		
		
		System.out.println("Let's see whether it is completely seperate or it overlaps..");
		boolean isOutside = false;
		if (((xFinderRightFR < xFinderLeftSR) || (xFinderLeftFR > xFinderRightSR))
				|| ((yFinderUpFR < yFinderDownSR) || (yFinderDownFR > yFinderUpSR))) {
			isOutside = true;
		}

		if (isOutside == true) {
			System.out.println("Second one is outside the first one..");
		} else
			System.out.println("Second one overlaps the first one..");

		scn.close();
	}

}
