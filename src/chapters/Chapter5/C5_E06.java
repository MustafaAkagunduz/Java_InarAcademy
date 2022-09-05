package chapters.Chapter5;

public class C5_E06 {

	public static void main(String[] args) {

		System.out.println("Miles\t\tKilometers\t   |\t\t\tKilometers\tMiles");

		// Number of elements= ((big element-little element)/increaseRate)+1
		// ((10-1)/1)+1=10 and ((65-20)/5)+1=10; both of them are 10
		// we need 10 steps(iterations) loop
		int miles = 1;
		double milesTOkmS;

		int kmS = 20;
		double kmSTOmiles;

		for (int i = 1; i <= 10; i++) {
			milesTOkmS = miles * 1.609;
			milesTOkmS = milesTOkmS * 100 / 100.0;
			kmSTOmiles = kmS / 1.609;
			kmSTOmiles = kmSTOmiles * 100 / 100.0;

			System.out.printf("%2d               %4.3f", miles, (miles * 1.609));
            System.out.print("\t\t   |   \t\t\t");
            System.out.printf("%2d \t\t%6.3f\n", kmS, (kmS / 1.609));

			miles ++;
			kmS += 5;
		}
		

	}

}
