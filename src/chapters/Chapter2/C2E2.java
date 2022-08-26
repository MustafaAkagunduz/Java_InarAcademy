package chapters.Chapter2;
import java.util.Scanner;
public class C2E2{
	public static void main(String[]args){
	
	//This code calculates the area and volume of a cylinder.
	
	Scanner scn= new Scanner(System.in);
	double radius=0.0, length=0.0, area=0.0, volume=0.0; 
	System.out.println("Enter the radius and length of a cylinder:");
	System.out.println("Radius: "); //gets the radius
	radius=scn.nextDouble();
	System.out.println("Length: "); //gets the length;

	//related calculations:
	area= radius* radius* Math.PI;
	volume= area*length;
	
	//results:
	System.out.println("The area is: " + area);
	System.out.println("The volume is: "+ volume);
	scn.close();
	}
}