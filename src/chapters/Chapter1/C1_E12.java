package chapters.Chapter1;

public class C1_E12 {
	public static void main(String[] args) {
		double km = 24 * 1.6;
		double timeHour = 1 + (40 / 60) + (35 / 60 / 60);
		double avgSpeed = km / timeHour;

		System.out.println("Speed(km/h) is: " + avgSpeed);

	}

}
