package chapters.Chapter2;
import java.util.Scanner;
public class C2E_13{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter  monthly contribution: ");
        double monthly = scn.nextDouble();		//user input
        double interestPerMonth = 5/100/12;
        double interestFactor = 1 + interestPerMonth;

        int counter = 6;
        double total = 0;

        while (counter != 0) {

            total = (total + monthly) * interestFactor;

            counter--;

        }

        System.out.println("At a %5 interest rate, you will get $"+ total+ " in your account after six months");
        scn.close();
    }}
