package chapters.Chapter2;
import java.util.Scanner;

public class C2E9{
	public static void main(String[] args) {
	
	double velocity_0=0.0, velocity_1=0.0, time=0.0;

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter first speed, last speed, and time(as a second): ");

        velocity_0 = scn.nextDouble();
        velocity_1 = scn.nextDouble();
        time = scn.nextDouble();

        double acceleration = (velocity_1 - velocity_0) / time;

        System.out.println("The average acceleration is "+ acceleration);
        
        scn.close();
    	}

}