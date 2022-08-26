package chapters.Chapter2;
import java.util.Scanner;
public class C2E_17{
    public static void main(String[] args) {
        
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scn.nextDouble();
	
	System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        int windSpeed = scn.nextInt();
        
        double windProcess = Math.pow(windSpeed, 0.16);

        double index = (35.74)+(0.6215*temperature)-(35.75*windProcess)+(0.4275*temperature*windProcess);
        System.out.println("The wind chill index is " + index);

	scn.close();

    }


}
