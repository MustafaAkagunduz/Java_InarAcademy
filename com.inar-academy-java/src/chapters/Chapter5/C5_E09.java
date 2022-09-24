package chapters.Chapter5;

import java.util.Scanner;

public class C5_E09 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String highestStudentName = " ", secondStudentName = "", currentStudentName = "", tempName = "";
		double highestScore = 0, secondScore = 0, currentScore = 0, tempScore = 0;

		System.out.print("Enter the number of students: ");
		int numberOfstudents = scn.nextInt();

		while (numberOfstudents >= 1) {

			System.out.print("Enter a student name: ");
			currentStudentName = scn.next();

			System.out.print("Enter the students score: ");
			currentScore = scn.nextDouble();

			tempScore = currentScore;
			tempName = currentStudentName;
			if (tempScore > secondScore && tempScore < highestScore) {

				secondScore = tempScore;
				secondStudentName = tempName;
			} else if (tempScore > secondScore && tempScore > highestScore) {
				highestScore = tempScore;
				highestStudentName = tempName;
			}

			numberOfstudents--;
		}
		System.out.println(highestStudentName + " is at the top and his/her score is: " + highestScore);
		System.out.println(secondStudentName + " is the second and his/her score is: " + secondScore);
		scn.close();
	}

}
