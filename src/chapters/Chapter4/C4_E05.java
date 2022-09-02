package chapters.Chapter4;

import java.util.Scanner;

public class C4_E05 {

	public static void main(String[] args) {

		// THIS CODE CALCULATES THE AREA OF THE REGULAR POLYGON..
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of the sides: ");
        int numberOfSides = scn.nextInt();

        System.out.println("Enter the length of the sides: ");

        double lengthOfOneSide = scn.nextDouble();

        double area = (numberOfSides *  lengthOfOneSide *  lengthOfOneSide) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of your polygon is: " + area);


		scn.close();
	}

}
