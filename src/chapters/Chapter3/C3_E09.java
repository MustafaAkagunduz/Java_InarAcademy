package chapters.Chapter3;
import java.util.Scanner;
public class C3_E09 {

	public static void main(String[] args) {
		
		//I DON'T KNOW WHICH VARIABLE TYPE TO USE and HOW TO FORM ALGORYTHM..
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN-10 number: ");
        int userInput=scn.nextInt();
        String convertedInput= String.valueOf(userInput);
        
        
        for(int i=0; i<convertedInput.length();i++) {
        	
        	
        //PLANNING TO FILL THE ARRAY WITH CHARACTERS OF convertedInput	
        	
        	
        }
        
        
        System.out.println("The ISBN-10 number is: ");
        scn.close();
	}

}
