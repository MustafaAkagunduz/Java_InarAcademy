package weeks.week_04;

public class PrintsTheSyllables{

	public static void main(String[] args) {
		
		//prints the syllables
		
		String aaa="Java is fun";
		String result= "";
		
		
		for(int i=0; i<aaa.length();i++) {
			char harf=aaa.toLowerCase().charAt(i);
			if(harf=='a' ||harf=='e' ||harf=='i' ||harf=='o' ||harf=='u') continue;
			else result+=harf;
			
			
		}System.out.println(result);

	}

}
