package chapters.Chapter2;
import java.util.Scanner;
public class C2E_14{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter your weight (pounds): ");
        double pounds = scn.nextDouble();


        System.out.print("Please enter you height (inches): ");
        double inches = scn.nextDouble();

        double kilograms = pounds * 0.45359237;

        double meters = inches * 0.0254;

        double metersConverter = Math.pow(meters, 2);

        System.out.println("Your BMI is: " + kilograms / metersConverter);
        scn.close();
    }

}
