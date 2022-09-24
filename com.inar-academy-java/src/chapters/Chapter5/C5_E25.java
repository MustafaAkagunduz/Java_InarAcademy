package chapters.Chapter5;

public class C5_E25 {

	public static void main(String[] args) {

		double appPI = 1.0;
		
		for (int i = 2; i <= 100000; i++) {

			appPI += Math.pow(-1, i + 1) / (2 * i - 1.0);
			
			if (i % 10000 == 0) {
				System.out.println("For value of the pi for = " + i + " is  " + (4.0 * appPI));
			}
		}
	}

}
