package codingBat.W2;
import java.util.Scanner;
public class SUMDOUBLE {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("PLEASE ENTER TWO NUMBERS: ");
		int v1=scn.nextInt();
		int v2=scn.nextInt();
		
		int sum= v1+v2;
		
		if(v1==v2) {sum=sum*2;}
		
		System.out.println(sum);
		
		scn.close();

	}

}
