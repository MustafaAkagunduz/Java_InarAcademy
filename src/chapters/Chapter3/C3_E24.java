package chapters.Chapter3;

public class C3_E24 {

	public static void main(String[] args) {
		
	//THIS PROGRAM PICKS A RANDOM CARD FROM A DECK OF 52 CARDS
		
	int suit=(int) (1+(Math.random()*4));
	String strSuit= "";
	
		switch(suit) {
		case 1:	strSuit+= "CLUBS"; break;
		case 2:	strSuit+= "DIAMONDS"; break;
		case 3:	strSuit+= "HEARTS"; break;
		case 4:	strSuit+= "SPADES"; break;
		}
	
	int card=(int) (1+(Math.random()*13));
	String strCard= "";
	
		switch(card) {
		case 1:		strCard+= "ACE"; 	break;
		case 2:		strCard+= "2"; 		break;
		case 3:		strCard+= "3"; 		break;
		case 4:		strCard+= "4"; 		break;
		case 5:		strCard+= "5"; 		break;
		case 6:		strCard+= "6"; 		break;
		case 7:		strCard+= "7"; 		break;
		case 8:		strCard+= "8"; 		break;
		case 9:		strCard+= "9"; 		break;
		case 10:	strCard+= "10"; 	break;
		case 11:	strCard+= "JACK"; 	break;
		case 12:	strCard+= "QUEEN"; 	break;
		case 13:	strCard+= "KING"; 	break;
		}
		
		System.out.println("THE CARD YOU PICKED IS "+ strCard  + " OF "+ strSuit);
		
		
	}		
}
