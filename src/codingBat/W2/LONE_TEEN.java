package codingBat.W2;
import java.util.Scanner;
public class LONE_TEEN {

	public static void main(String[] args) {
	boolean v1bool=false, v2bool=false;
	Scanner scn=new Scanner(System.in);
	System.out.println("Please enter two values: ");
	int v1=scn.nextInt();
	int v2=scn.nextInt();
	
	if(v1 >= 13 && v1 <= 19) {v1bool=true;} else v1bool=false;
	if(v2 >= 13 && v2 <= 19) {v2bool=true;}
	
		System.out.println((v1bool && !v2bool) || (!v1bool && v2bool));
		
		scn.close();
	}

}

