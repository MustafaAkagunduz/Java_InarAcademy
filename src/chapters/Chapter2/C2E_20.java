package chapters.Chapter2;
import java.util.Scanner;
public class C2E_20{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the balance and interest rate: (e.g., 3 for 3%): ");

        double balance = scn.nextDouble();
        double rate = scn.nextDouble();
        double interest = balance * (rate / 1200);
        double roundInterest = Math.round(interest * 100000) / 100000.0;
        System.out.println("The interest rate is: " + roundInterest);
        scn.close();


    }
}
