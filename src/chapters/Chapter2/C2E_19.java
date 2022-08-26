package chapters.Chapter2;
import java.util.Scanner;
public class C2E_19{
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");

        	double x1 = scn.nextDouble();
        	double y1 = scn.nextDouble();
        	double x2 = scn.nextDouble();
        	double y2 = scn.nextDouble();
        	double x3 = scn.nextDouble();
        	double y3 = scn.nextDouble();

        	double s1 = sideFinder(x1, y1, x2, y2);
        	double s2 = sideFinder(x2, y2, x3, y3);
        	double s3 = sideFinder(x1, y1, x3, y3);

        double factor = (s1 + s2 + s3) / 2;

        double area = Math.sqrt((factor * (factor - s1) * (factor - s2) * (factor - s3)));

        System.out.println("The area of the triangle is: " + area);
        scn.close();
    }

    public static double sideFinder(double x0, double y0, double x1, double y1) {
        return Math.pow(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2), 0.5);
    }
	

}
