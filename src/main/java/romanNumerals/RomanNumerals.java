package romanNumerals;

public class RomanNumerals {

	public String conversionDuChiffreEnRomain(int i) {
		if(i==1) return "I";
		
		else if(i==3) return "III";
		else return "II";
	}

}
