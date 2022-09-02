package chapters.Chapter4;

import java.util.Scanner;

public class C4_E04 {

	public static void main(String[] args) {

		// THIS CODE CALCULATES THE AREA OF THE HEXAGON..

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the one side of the hexagon whose area you wanted to calculate: ");
		double side = scn.nextDouble();
		
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		area= (int)(area*100.0)/100;
		System.out.println("Area of the hexagon is: " + area);

		scn.close();
	}

}
