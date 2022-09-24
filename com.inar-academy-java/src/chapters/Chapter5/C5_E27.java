package chapters.Chapter5;

public class C5_E27 {

	public static void main(String[] args) {
		int counter = 0;
		for (int year = 2001; year <= 2100; year++) {

			if (year%4==0) {
				System.out.print(year + " ");
				counter++;
				if (counter == 10) {
					System.out.println();
					counter=0;
				}
				
			}
		}

	}
}
