package chapters.Chapter3;
import java.util.Scanner;
public class C3_E20 {
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit (between -58°F and 41°F): ");
        double temperature = scn.nextDouble();

        System.out.println("Enter the wind speed: ");
        int wind = scn.nextInt();

        if (temperature >= -58 && temperature <= 41 && wind >= 2) {
        		double factor = Math.pow(wind, 0.16);
        		double result = 35.74 + 0.6215 * temperature - 35.75 * factor + 0.4275 * temperature * factor;
        		System.out.println("The result is " + result);
        } 
        else System.out.println("invalid input.");
        
        scn.close();
		
		}
}
