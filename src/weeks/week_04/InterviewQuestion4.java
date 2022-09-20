package weeks.week_04;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		
		//Removes the duplicated characters and returns one of them
			String str = "Inar Academy";
			String sum = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (sum.contains("" + ch) == false) { //contains strimg aldığı için kandırdık..
					sum += ch;

				}
			}
			System.out.println(sum);
		

	}

}
