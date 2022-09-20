package weeks.week_04;

/**
 * 1 - Anlat / Soru sor 2 - Ornekle 3 - Algoritmani sozel ifade et 4 - Test case
 * olustur 5 - Kod yaz 6 - test et
 */

// replace metodu var , ama istenmeyebilir..implement isteyebilir, charAt'e izin
// verebilir.

public class InterviewQuestion2 {

	public static void main(String[] args) {

		
		//converts the vowels into 'x'..
		
		//first solution
		interview2("Java is Fun");
		
		
		//second solution
		String aaa="Java is Fun";
		
		
		for(int i=0; i<aaa.length();i++) {
			char harf=aaa.toLowerCase().charAt(i);
			if(harf=='a' ||harf=='e' ||harf=='i' ||harf=='o' ||harf=='u') harf='x';
			System.out.print(harf);
			
			
		}

	}

	public static void interview2(String str) {

		String result = str.replace('a', 'x');
		result = result.replace('e', 'x');
		result = result.replace('i', 'x');
		result = result.replace('o', 'x');
		result = result.replace('u', 'x');
		System.out.println(result);

		// Required output: "Jxvx xs Fxn";

	}
}
