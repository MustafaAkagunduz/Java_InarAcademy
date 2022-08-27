package codingBat;
import java.util.Scanner;
public class INT_MAX {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	int v1=scn.nextInt();
	int v2=scn.nextInt();
	int v3=scn.nextInt();
	
	if(v1>v2 && v1>v3) { System.out.println("Biggest is: "+ v1); }
	if(v2>v1 && v2>v3) { System.out.println("Biggest is: "+ v2); }
	if(v3>v1 && v3>v2) { System.out.println("Biggest is: "+ v3); }
	
	

		
		
		
		
	scn.close();
	}

}
