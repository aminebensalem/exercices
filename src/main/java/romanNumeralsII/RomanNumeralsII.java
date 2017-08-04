package romanNumeralsII;

public class RomanNumeralsII {

	public String convertNumber(String number) {
		if(number.equals("1")){
			return "I";
		} else if(number.equals("2")){
			return "II";
		}
		else
			return "III";
	}	
}
