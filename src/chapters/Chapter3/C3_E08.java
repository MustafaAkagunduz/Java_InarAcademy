package chapters.Chapter3;
import java.util.Scanner;
public class C3_E08 {

	public static void main(String[] args) {
	
	Scanner scn= new Scanner(System.in);
	int v1=0, v2=0, v3=0;
	
	System.out.println("Enter three integers to sort: ");
	v1=scn.nextInt();
	v2=scn.nextInt();
	v3=scn.nextInt();
	
	System.out.println("Numbers you entered: "+ v1 + " "+ v2+ " "+ v3);
	
	if(v1>v2 && v1>v3) {
		if(v2>v3) {System.out.println("Numbers sorted: "+ v1 + " "+ v2+ " " + v3);}
		else System.out.println("Numbers sorted: "+ v1 + " "+ v3+ " " + v2);
	}
	
	if(v2>v1 && v2>v3) {
		if(v1>v3) {System.out.println("Numbers sorted: "+ v2 + " "+ v1+ " " + v3);}
		else System.out.println("Numbers sorted: "+ v2 + " "+ v3+ " " + v1);	
	}		
	if(v3>v1 && v3>v2) {
		if(v2>v1) {System.out.println("Numbers sorted: "+ v3 + " "+ v2+ " " + v1);}
		else System.out.println("Numbers sorted: "+ v3 + " "+ v1+ " " + v2);
	}
	scn.close();
	}

}
