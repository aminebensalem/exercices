package bankOcr;

public class BankOcr {

	public static int convertisseur(String digit) {
		if(digit.equals("|_|\n  |\n")){
			return 4;
		}
		if(digit.equals(" _ \n _|\n _|\n")){
			return 3;
		}
		if(digit.equals(" _ \n _|\n|_ \n")){
			return 2;
		}
		return 1;
	}
	
}
