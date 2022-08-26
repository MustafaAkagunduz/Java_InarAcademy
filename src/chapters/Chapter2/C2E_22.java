package chapters.Chapter2;
import java.util.Scanner;
public class C2E_22{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter dollar amount as an integer (whose last two digits represent the cents)");
        int firstDollarInput = scn.nextInt();

        int quarters = 0, dimes = 0, nickles = 0, pennies = 0;

        int cents = firstDollarInput % 100;
        int dollars = firstDollarInput / 100;
        quarters = cents / 25;
        cents %= 25;

        dimes =(int) cents / 10;
        cents %= 10;
        nickles =(int) cents / 5;
        cents %= 5;
        pennies =(int) cents / 1;
        cents %= 1;

        System.out.println("Your integer cents amount " + firstDollarInput + " consists of " + "\n" + dollars + " dollars" + "\n"
                + quarters + " quarters " + "\n" + dimes + " dimes" + "\n" + nickles + " nickels" + "\n" + pennies
                + " pennies");

        scn.close();
    }
}

