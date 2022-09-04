package chapters.Chapter1;

public class C1_E10 {

	public static void main(String[] args) {

		double miles = 14 / 1.6; // Convert kilometers into MPH
		double seconds = 30 + (45 * 60);
		double speed = miles / seconds; // Average speed in miles per hour

		System.out.printf("Speed of the runner is: " + speed);

	}
}
