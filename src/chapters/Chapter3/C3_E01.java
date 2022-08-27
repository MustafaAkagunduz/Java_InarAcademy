package chapters.Chapter3;
import java.util.Scanner;
public class C3_E01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter values for a, b, and c now: ");

        double a=0.0, b=0.0, c=0.0;

        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else if (discriminant > 0) {
            double r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.print("The equation has two roots: " + r1 + ", " + r2);


        } else {
            double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.print("The equation has one root: " + r);
        }
        scn.close();

	}

}
