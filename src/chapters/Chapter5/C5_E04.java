package chapters.Chapter5;

public class C5_E04 {
	public static void main(String[] args) {

		System.out.println("Miles\tKilometers");
		for (int i = 1; i <= 10; i++) {
			double kmS;
			kmS = i * 1.609;
			kmS = (int) (kmS * 100) / 100.00;
			System.out.println(i + "\t" + kmS);

		}
	}
}
