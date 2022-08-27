package chapters.Chapter3;
import java.util.Scanner;
public class C3_E02 {

	public static void main(String[] args) {
		int a = (int) (System.currentTimeMillis() % 10);
        int b = (int) (System.currentTimeMillis() / 7 % 10);
        int c = (int) (System.currentTimeMillis() / 5 % 10);

        int answer = a + b + c;


        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter the result: " + a + " + " + b + " + " + c + " = ");

        int userInput = scn.nextInt();

        if (userInput == answer) {
            System.out.println("Correct answer!");
        } else
            System.out.println("Please try again");

        scn.close();

	}

}
