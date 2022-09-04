package chapters.Chapter4;

import java.util.Scanner;

public class C4_E24 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the first city: ");
		String firstCity = scn.nextLine();
		System.out.println("Enter the second city: ");
		String secondCity = scn.nextLine();
		System.out.println("Enter the third city: ");
		String thirdCity = scn.nextLine();

		String first = "", second = "", last = "";

		if (firstCity.charAt(0) < secondCity.charAt(0) && firstCity.charAt(0) < thirdCity.charAt(0)) {
			first = firstCity;
			if (secondCity.charAt(0) < thirdCity.charAt(0)) {
				second = secondCity;
				last = thirdCity;
			} else {
				second = thirdCity;
				last = secondCity;
			}

		}

		if (secondCity.charAt(0) < firstCity.charAt(0) && secondCity.charAt(0) < thirdCity.charAt(0)) {
			first = secondCity;
			if (firstCity.charAt(0) < thirdCity.charAt(0)) {
				second = firstCity;
				last = thirdCity;
			} else {
				second = thirdCity;
				last = firstCity;
			}

		}

		if (thirdCity.charAt(0) < secondCity.charAt(0) && thirdCity.charAt(0) < firstCity.charAt(0)) {
			first = thirdCity;
			if (secondCity.charAt(0) < firstCity.charAt(0)) {
				second = secondCity;
				last = firstCity;
			} else {
				second = firstCity;
				last = secondCity;
			}

		}

		System.out.println("The three cities in alphabetical order are: " + first + " " + second + " " + last);

		scn.close();

	}

}
