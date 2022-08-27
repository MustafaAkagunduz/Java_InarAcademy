package codingBat.W2;
import java.util.Scanner;
public class IN1020 {

	public static void main(String[] args) {
	
	int v1=0, v2=0;	
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Please enter two values: ");
	v1=scn.nextInt();
	v2=scn.nextInt();
	
	if ((v1 >= 10 && v1 <= 20) || (v2 >= 10 && v2 <= 20)) { System.out.println(true); 
	} else System.out.println(false);
	
	scn.close();

	}
	
}
