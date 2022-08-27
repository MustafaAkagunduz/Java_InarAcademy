package chapters.Chapter3;
import java.util.Scanner;
public class C3_E05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter today's day(Sunday is 0, Monday is 1, and Saturday is 6): ");


        int day = scn.nextInt();

        if (day > 6 || day < 0) {
            System.out.println("Please enter a number between 0 and 6");
            
        } else {
            System.out.print("Enter the number of days elapsed since today: ");
            int future = scn.nextInt();

            int result = (day + future) % 7;

            String[] daysArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println("Today is: " + daysArray[day] + " and the future day is: "   +daysArray[result]);
            scn.close();
        }

	}

}
