package chapters.Chapter5;

import java.util.Scanner;

public class C5_E22 {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Loan amount: ");
        double loanAmount = scn.nextDouble();

        System.out.println("Number of years: ");
        int numOfYears = scn.nextInt();

        System.out.println("Annual Interest Rate: ");
        double annualRate = scn.nextDouble();

        
        double monthlyInterestRate = annualRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12)));
        System.out.println("Monthly Payment: "+ monthlyPayment);

        double totalPayment = monthlyPayment * numOfYears * 12;
        System.out.println("Total Payment:   "+ totalPayment);
        
        
        double balance = totalPayment;
        double principalMoney=0;
        System.out.println();
        System.out.println("Payment#\tInterest\tPrincipal\t\tBalance");

        for (int payment = 1; payment <= numOfYears * 12; payment++) {

            double interest = monthlyInterestRate * balance;
            principalMoney = monthlyPayment - interest;
            balance = balance - principalMoney;
            System.out.println(payment+"\t"+ interest+"\t"+ principalMoney+"\t"+ balance);
        }


        scn.close();
    }

}
