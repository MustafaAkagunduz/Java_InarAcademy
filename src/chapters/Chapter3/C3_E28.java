package chapters.Chapter3;

import java.util.Scanner;

public class C3_E28 {

	public static void main(String[] args) {
		
		boolean isInside=false;
		Scanner scn=new Scanner(System.in);
		
		
		//INFORMATION INPUTS OF FIRST RECTANGLE
		
		System.out.println("Please enter the center coordinates of first rectangle(axis x first, then axis y): ");
		int xFirst=scn.nextInt();
		int yFirst=scn.nextInt();
		System.out.println("Please enter the width of the first rectangle: ");
		int widthFirst=scn.nextInt();
		System.out.println("Please enter the height of the first rectangle: ");
		int heightFirst=scn.nextInt();
		
		System.out.println("Information about first rectangle: CENTER: "+ xFirst + ","+ yFirst+ " //Width:"+ widthFirst+ " Height:"+ heightFirst);
		
		int xFinderRightFR = xFirst+(widthFirst/2);
		int xFinderLeftFR= xFirst-(widthFirst/2);
		int yFinderUpFR   = yFirst+(heightFirst/2);
		int yFinderDownFR = yFirst-(heightFirst/2);
		
		System.out.println("Here is the rectangle first:");
		System.out.println("AXIS-X POINTS OF THE SECOND: "+xFinderLeftFR+ " " + xFinderRightFR );
		System.out.println("AXIS-Y POINTS OF THE SECOND: "+yFinderUpFR+ " " +    yFinderDownFR);
		
		
		
		//INFORMATION INPUTS OF SECOND RECTANGLE
		
		System.out.println("Please enter the center coordinates of second rectangle(axis x first, then axis y): ");
		int xSecond=scn.nextInt();
		int ySecond=scn.nextInt();
		System.out.println("Please enter the width of the second rectangle: ");
		int widthSecond=scn.nextInt();
		System.out.println("Please enter the height of the second rectangle: ");
		int heightSecond=scn.nextInt();
		
		System.out.println("Information about second rectangle: CENTER: "+ xSecond + ","+ ySecond+ " //Width:"+ widthSecond+ " Height:"+ heightSecond);
		
		int xFinderRightSR = xSecond+(widthSecond/2);
		int xFinderLeftSR= xSecond-(widthSecond/2);
		int yFinderUpSR   = ySecond+(heightSecond/2);
		int yFinderDownSR = ySecond-(heightSecond/2);
		
		System.out.println("Here is the rectangle Second:");
		System.out.println("AXIS-X POINTS OF THE SECOND: "+xFinderLeftSR+ " " + xFinderRightSR );
		System.out.println("AXIS-Y POINTS OF THE SECOND: "+yFinderUpSR+ " " +    yFinderDownSR);
		
		if(((yFinderUpFR > yFinderUpSR) && (yFinderDownFR< yFinderDownSR)) && ((xFinderRightFR>xFinderRightSR) && (xFinderLeftFR<xFinderLeftSR)) ) {isInside=true;}
		else isInside=false;
		
		
		
		
		
		if(isInside==true) { System.out.println("The second rectangle is inside the first rectangle...");
		} else  System.out.println("The second rectangle overlaps the first rectangle...");
		
		
		scn.close();
		}

}
