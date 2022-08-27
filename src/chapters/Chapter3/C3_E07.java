package chapters.Chapter3;
import java.util.Scanner;
public class C3_E07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.print("Enter an dollar amount: ");
        double rawDollars = scn.nextDouble();

        int cents = (int) (rawDollars * 100); //converting dollars into cents...

        int oneDollars = 	cents / 100;
        					cents %= 100;

        int quarters = 		cents / 25;
        					cents %= 25;

        int dimes = 		cents / 10;
        					cents %= 10;

        int nickles = 		cents / 5;
        					cents %= 5;

        int pennies = cents;

        System.out.println("Your amount is:  " + rawDollars );
        System.out.println("   " + oneDollars + " one dollars");
        System.out.println("   " + quarters + " quarters");
        System.out.println("   " + dimes + " dimes");
        System.out.println("   " + nickles + " nickels");
        System.out.println("   " + pennies +" pennies");
        
        scn.close();


	}

}
