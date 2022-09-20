package weeks.week_04;

public class InterviewQuestion1 {

	public static void main(String[] args) {

		/*
		 * HOW TO CONVERT SIGNED INTEGER TO STRING 84-->84 // -84-->"-84"
		 * 
		 * 1 - Anlat 
		 * 2 - Ornekle 
		 * 3 - Algoritmani sozel ifade et
		 * 4 - Test case olustur 
		 * 5 - Kod yaz
		 * 6 - test et
		 * 
		 */

		int a = -84;
		String aa = " " + a;
		

		System.out.println(a + " and " + aa);

		System.out.println("Test: a+a= " + (a + a));
		System.out.println("Test2: aa+aa= " + (aa + aa));

		String str2 = Integer.toString(a);
		System.out.println("Second Case: " + str2 + "dir.." + " Testi: " + (str2 + str2));

	}

}
