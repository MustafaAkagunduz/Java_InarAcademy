package chapters.Chapter5;

public class C5_E19 {

	public static void main(String[] args) {

		int a = 0, spaceCnt = 7;
		for (int i = 1; i <= 128; i += i) {
			for (int s = 1; s <= spaceCnt; s++) {
				System.out.print(" ");
			}
			for (int left = 1; left <= i; left += left) {
				System.out.print(left);
			}
			for (int right = a; right > 0; right /= 2) {
				System.out.print(right);
			}
			a = i;
			spaceCnt--;
			System.out.println();

		}

	}
}
