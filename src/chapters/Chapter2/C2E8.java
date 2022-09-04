package chapters.Chapter2;

import java.util.Scanner;

public class C2E8 {
	public static void main(String[] arsg) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT now: "); // input should be "+3" for İstanbul

		int offset = scn.nextInt();
		long totalMilliseconds = System.currentTimeMillis(); // gets the milliseconds based on EPOCH time.
		long seconds = totalMilliseconds / 1000;
		long currentSecond = seconds % 60;
		long minutes = seconds / 60;
		long currentMinute = minutes % 60;
		long hours = minutes / 60;
		long currentHour = hours % 24;

		currentHour += offset;

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

		scn.close();
	}

}
