package codingBat;
import java.util.Scanner;
public class MAKES10 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		boolean isTen=false;
		System.out.println("Please enter two numbers: ");
		int v1=scn.nextInt();
		int v2=scn.nextInt();
		
		if(v1 == 10 || v2 == 10 || v1+v2 == 10) {isTen=true;}
		
		
		System.out.println("Expression 'their sum are 10 is: "+ isTen);
		
		
		
		
		
		scn.close();

	}

}
