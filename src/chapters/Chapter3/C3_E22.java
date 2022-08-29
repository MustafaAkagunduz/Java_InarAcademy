package chapters.Chapter3;

import java.util.Scanner;

public class C3_E22 {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	
	System.out.println("We have a circle, its center is 0,0 and its radius is 10:");
	
	System.out.println("Please enter a point(first x, then y): ");
	System.out.println("POINT-X: ");
	double x=scn.nextDouble();
	System.out.println("POINT-Y: ");
	double y=scn.nextDouble();
	
	System.out.println("Let's see whether your point is in the circle...");
	
	double distanceToCenter= Math.pow(Math.pow((x-0.0),2) + Math.pow((y-0.0),2),0.5);
	
	if (distanceToCenter<=Math.pow(100.0, 0.5)) {System.out.println("Your point is in the circle..");
	}else System.out.println("Your point is outside of the circle..");
	
	
	scn.close();
	}

}
