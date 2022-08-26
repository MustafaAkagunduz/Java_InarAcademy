package chapters.Chapter2;
import java.util.Scanner;
public class C2E_21{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = scn.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = scn.nextDouble();

        System.out.println("Enter number of years: ");
        double years = scn.nextInt();

	years= years*12;
        monthlyInterestRate=monthlyInterestRate/1200;

        System.out.println("Accumulated Value is $"+ investmentAmount * Math.pow(monthlyInterestRate + 1, years));
        scn.close();

    }

}
