package chapters.Chapter5;

public class C5_E12 {

	public static void main(String[] args) {

		int i = 1;

		while (i * i < 12000) {

			i++;

		}
		System.out.println(i); // output is 110 because: (109*109=11881 and 110*110=12100)

	}

}
