package chapters.Chapter2;
import java.util.Scanner;
public class C2E_23{
    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
        double distance=0.0, milesPerGallon=0.0, pricePerGallon=0.0;
        
	System.out.println("Enter the driving distance(miles):");
	distance = scn.nextDouble();

        System.out.println("Enter the miles per gallon:");
	milesPerGallon = scn.nextDouble();

        System.out.println("Enter the price of gas per gallon:");
	pricePerGallon = scn.nextDouble();

        double costOfTrip= (distance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving for this trip is: $"+costOfTrip);
        scn.close();
    }

}
