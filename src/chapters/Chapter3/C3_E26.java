package chapters.Chapter3;
import java.util.Scanner;
public class C3_E26 {

	public static void main(String[] args) {
	
	boolean and=false, or=false, xor=false;	
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter an integer: ");
	int divide=scn.nextInt();
	
	if(divide%5==0  && divide%6==0)                                    {and=true;}
	if(divide%5==0  || divide%6==0)                                    {or=true;}
	if((divide%5==0 || divide%6==0) ^  (divide%5==0 && divide%6==0))   {xor=true;}
	
	System.out.println("Is " + divide + " divisible by 5 and 6? " + and );
	System.out.println("Is " + divide + " divisible by 5 or 6? " + or );
	System.out.println("Is " + divide + " divisible by 5 or 6, but not both?(xor process) " + xor );
	scn.close();
	}

}
