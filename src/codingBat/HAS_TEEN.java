package codingBat;
import java.util.Scanner;
public class HAS_TEEN {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	System.out.println("Please enter a number: ");		
	int number=scn.nextInt();
	if(number>=13 && number<=19) { System.out.println(number+ " has 'teen' in its pronunciation..");
	}else System.out.println(number+ " hasn't 'teen' in its pronunciation..");
	
	
	
	scn.close();
		
		
		
	

	}
	
	

}
