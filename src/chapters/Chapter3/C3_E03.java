package chapters.Chapter3;
import java.util.Scanner;
public class C3_E03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter a ,b ,c ,d ,e , and f: ");

        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        double d = scn.nextDouble();
        double e = scn.nextDouble();
        double f = scn.nextDouble();
        double y = 0;
        double x = 0;

        if (a*d - b*c < 0.000000001) {
            System.out.println("The equation has no solution");
            

        } else {

            x = (e*d - b*f) / (a*d - b*c);
            y = (a*f - e*c) / (a*d - b*c);

            

            System.out.print("x = " + x + " and y is: " + y );

            scn.close();
        }

	}
	

}
