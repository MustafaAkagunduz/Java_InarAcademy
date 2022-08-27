package chapters.Chapter3;
import java.util.Scanner;
public class C3_E19 {

	public static void main(String[] args) {
	
	double e1=0.0, e2=0.0, e3=0.0;	
		
	Scanner scn= new Scanner(System.in);
	
	System.out.println("Please enter the edges of a triangle");
	e1=scn.nextInt();
	e2=scn.nextInt();
	e3=scn.nextInt();
	
	if ( e1>(e2+e3)|| e2>(e1+e3)|| e3>(e1+e2) ) {System.out.println("The entries are invalid...");}
	else System.out.println("The perimeter is "+ (e1+e2+e3));
	
		
	scn.close();
	}

}
