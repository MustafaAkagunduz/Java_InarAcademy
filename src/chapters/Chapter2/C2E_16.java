
package chapters.Chapter2;
import java.util.Scanner;
public class C2E_16{
    public static void main(String[] args) {
        
	Scanner scn = new Scanner(System.in);

        System.out.println("Enter the side of a hexagon: ");
        double side = scn.nextDouble();

        double processor = (3 * Math.pow(3, 0.5)) / 2;
        double result = processor * Math.pow(side, 2);
        
	System.out.println("The area of the hexagon is " + result);
	scn.close();
    }
}
