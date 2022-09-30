package chapters.Chapter6;

public class C6_E25 {

	public static void main(String[] args) {

		System.out.println(convertMillis(555550000));

	}

	public static String convertMillis(long millis) {

		long seconds = millis / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;

		return hours + ":" + (minutes % 60) + ":" + (seconds % 60);
	}

}
