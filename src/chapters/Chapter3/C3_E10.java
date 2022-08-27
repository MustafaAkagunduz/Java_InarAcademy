package chapters.Chapter3;
import java.util.Scanner; 
public class C3_E10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int value1 = (int) (Math.random() * 100); 
        int value2 = (int) (Math.random() * 100);
        int sum	   = value1+value2;
        System.out.println(value1 + " + " + value2 + " = ? ");
        System.out.println("Your answer: ");
        int userInput = scn.nextInt();

        	if (sum == userInput) {
            System.out.println("Correct Answer, Congrats!!");
        	}else {
            System.out.println("Unfortunately, Your answer is wrong.");
            }
        	
        	scn.close();
	}  
}
