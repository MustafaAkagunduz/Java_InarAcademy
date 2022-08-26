package chapters.Chapter2;
import java.util.Scanner;
public class C2E_11 {

	public static void main(String[] args) {
		
		int currentPopulation = 0;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of years to display the population growth: ");

        int years = scn.nextInt();

        double secondsInYear = 365 * 24 * 60 * 60;

        int birthsPerYear = (int) secondsInYear / 7;
        int deathsPerYear = (int) secondsInYear / 13;
        int immigrantsPerYear = (int) secondsInYear / 45;

        for (int i = 1; i <= years; i++) {
            currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
        }
        System.out.println("The population in " + years + " is " + currentPopulation);

		scn.close();
		
		
		
	}

}
