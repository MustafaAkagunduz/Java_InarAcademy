package chapters.Chapter6;

public class C6_E09 {

	public static void main(String[] args) {

		System.out.println("Feet\t\tMeters\t\t|\tMeters\tFeet");
		double feet = 1.0, meters = 20.0;
		for (int i = 1; i <= 10; i++) {

			System.out.println(feet + "\t\t" + footToMeter(feet) + "\t\t|\t" + meters + "\t" + meterToFoot(meters));
			feet += 1.0;
			meters += 5.0;

		}

	}

	/** Convert from foot to meter */
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;

	}

	/** Convert from meter to foot */
	public static double meterToFoot(double meter) {

		double foot = 3.279 * meter;
		return foot;
	}

}
