package chapters.Chapter3;

import java.util.Scanner;

public class C3_E16 {

	public static void main(String[] args) {
	
	Scanner scn= new Scanner(System.in);
	boolean isXin=false, isYin=false;
	System.out.println("There is a rectangle, its center is 0,0 and it's width is 100 and it's height is:200");
	
	System.out.println("Please enter a point (first x, then y), we'll see whether it is in/out of our rectangle..");
	int xInput=scn.nextInt();
	int yInput=scn.nextInt();
	
	if( xInput<=50   && xInput>=-50  ) {   isXin=true;}
	if( yInput<=100  && yInput>=-100 ) {   isYin=true;}           
	
	if( isXin&&isYin == true) { System.out.println("Your point is in/on the rectangle.. "); 
	}else System.out.println("Your point is outside of the rectangle.");
	
	scn.close();
	
	}
}
