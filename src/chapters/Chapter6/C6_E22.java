package chapters.Chapter6;

public class C6_E22 {

	public static void main(String[] args) {
		
		System.out.println(sqrt(4));

	}

	
	public static double sqrt(long n) {
		
		double lastGuess = 2;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while ((Math.abs(nextGuess- lastGuess)>0.0001)) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
	}
	
	
}
