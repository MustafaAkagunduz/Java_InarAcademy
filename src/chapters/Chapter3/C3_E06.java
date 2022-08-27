package chapters.Chapter3;
import java.util.Scanner;
public class C3_E06{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

       
        System.out.println("Enter weight in pounds: ");
        double weightPound = scn.nextDouble();

        //User Inputs
        System.out.println("Enter feet: ");
        double feet = scn.nextDouble();
        System.out.println("Enter inches: ");
        double inches = scn.nextDouble();

        //Required calculations...
        double height = inches + (feet * 12);
        double kilograms = weightPound * 0.45359237;
        double meters = height * 0.0254;
        double bmi = kilograms / (meters * meters);

        //output results..
        System.out.println("BMI is " + bmi);
        
        if (bmi < 18.5) {System.out.println("Underweight");}
        else if(bmi < 25) {System.out.println("Normal");}
        else if(bmi < 30) {System.out.println("Overweight");}
        else { System.out.println("Obese");
        }
        scn.close();
    }
}
