package chapters.Chapter2;
import java.util.Scanner;
public class C2E_12 {

	public static void main(String[] args) {
		
		
		
		    
		Scanner scn = new Scanner(System.in);

        System.out.print("Enter speed (meters/second) and acceleration (meters/second squared): ");
        double speed = scn.nextDouble();
        double acceleration = scn.nextDouble();
	double runwayDistance= Math.pow(speed, 2) / (2 * acceleration);

        System.out.printf("The length of runway need is: "+runwayDistance);
        scn.close();
		    }
		



	

}
