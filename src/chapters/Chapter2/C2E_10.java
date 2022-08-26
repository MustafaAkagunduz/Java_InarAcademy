package chapters.Chapter2;
import java.util.Scanner;
public class C2E_10 {

	public static void main(String[] args) {
		double initialTemperature;
        double finalTemperature;
        double weightOfWater;


        System.out.println("Enter the weight of the water in Kilograms");

        Scanner scn = new Scanner(System.in);
        weightOfWater = scn.nextDouble();

        System.out.println("Enter the initial temperature of the water in Celsius");
        initialTemperature = scn.nextDouble();
        
        System.out.println("Enter the final temperature of the water in Celsius");
        finalTemperature = scn.nextDouble();

        double result; //as a joule

        result = weightOfWater * (finalTemperature - initialTemperature) * 4184; //we consider 1 calori=4184 jolues

        System.out.println("The energy needed is " + result + " Joules");
        scn.close();

	}

}
