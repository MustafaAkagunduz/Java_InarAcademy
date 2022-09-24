package chapters.Chapter6;

public class C6_E16 {

	public static void main(String[] args) {

		System.out.println("Year\t\tNumber Of Day");
		System.out.println("----------------------------");

		for (int i = 2000; i <= 2020; i++) {

			System.out.println(i + "\t\t" + numberOfDaysInAYear(i));

		}

	}

	public static int numberOfDaysInAYear(int year) {

		if (year % 4 == 0)
			return 366;
		else
			return 365;

	}

}
