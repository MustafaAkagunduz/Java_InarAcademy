package chapters.Chapter5;

public class C5_E05 {
	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds\t|\tPounds\t\tKilograms");

		// Number of elements= ((big element-little element)/increaseRate)+1
		// ((515-20)/5)+1=100 and ((199-1)/2)+1=100; both of them are 100
		// we need 100 steps(iterations) loop
		int kg = 1;
		double kgTOpd;

		int pd = 20;
		double pdTOkg;

		for (int i = 1; i <= 100; i++) {
			kgTOpd = kg * 2.2;
			kgTOpd = (int) kgTOpd * 100 / 100.0;
			pdTOkg = pd / 2.2;
			pdTOkg = (int) pdTOkg * 100 / 100.0;

			System.out.println(kg + "\t\t" + kgTOpd + "\t|\t" + pd + "\t\t" + pdTOkg);

			kg += 2;
			pd += 5;
		}

	}
}
