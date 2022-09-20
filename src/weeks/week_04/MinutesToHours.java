package weeks.week_04;

import java.util.Scanner;

public class MinutesToHours {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter minutes: ");
		int dakika = scn.nextInt();

		int artikDakika = dakika % 60;
		int saat = (int) dakika / 60;

		if (dakika < 0) {
			System.out.println("Invalid input.. ");
		}

		else
			System.out.println(dakika + " minutes = " + saat + " hours and " + artikDakika + " minutes");
		
		scn.close();

	}

}
