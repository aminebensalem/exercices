package romanNumeralsII;

public class RomanNumeralsII {

	public String convertNumber(String number) {
		String resultat="";
		for(int i = 1 ; i <= Integer.valueOf(number) ; i += 1 ){
			resultat += "I";
		}
		return resultat;
	}	
}
