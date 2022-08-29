package chapters.Chapter3;

import java.util.Scanner;

public class C3_E23 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		boolean isXin=false, isYin=false;
		System.out.println("There is a rectangle, its center is 0,0 and it's width is 100 and it's height is:200");
		
		System.out.println("System chooses random point which is in/on the rectangle");
		double xInput=scn.nextDouble();
		double yInput=scn.nextDouble();
		
		if( xInput<=5   && xInput>=-5  ) {   isXin=true;}
		if( yInput<=2.5  && yInput>=-2.5 ) {   isYin=true;}           
		
		if( isXin&&isYin == true) { System.out.println("Your point is in/on the rectangle.. "); 
		}else System.out.println("Your point is outside of the rectangle.");
		
		scn.close();
		
		}

}
