package chapters.Chapter1;

public class C1_E11 {
	public static void main(String[] args) {

		double currentPopulation  = 312032486;
		double totalSecondsInYear = 365 * 24 * 60 * 60;
		double birth              = 1.0 / 7;
		double death     		  = 1.0 / 13;
		double immigration        = 1.0 / 45;
		
		System.out.println("Current population is :  " + currentPopulation);

		for (int i = 1; i <= 5; i++) {
			
			currentPopulation += (totalSecondsInYear * (birth + immigration - death));
			System.out.println(i + ". years population is : " + currentPopulation);

		}
	}

}
