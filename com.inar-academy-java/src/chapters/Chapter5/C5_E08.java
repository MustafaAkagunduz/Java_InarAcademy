package chapters.Chapter5;

import java.util.Scanner;

public class C5_E08 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String highestStudentName = " ", currentStudentName = "";
		double highestScore = 0, currentScore = 0;

		System.out.print("Enter the number of students: ");
		int numberOfstudents = scn.nextInt();

		while (numberOfstudents >= 1) {

			System.out.print("Enter a student name: ");
			currentStudentName = scn.next();

			System.out.print("Enter the students score: ");
			currentScore = scn.nextDouble();

			if (currentScore > highestScore) 
				highestScore = currentScore;
				highestStudentName = currentStudentName;
			

			numberOfstudents--;
		}
		System.out.println(highestStudentName + " is at the top and his/her score is: " + highestScore);
		scn.close();
	}

}
