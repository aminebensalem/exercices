package romanNumeralsII;

public class RomanNumeralsII {

	public String convertNumber(String number) {
		String resultat="";
		if(number.length() == 1){
			resultat = chiffreEntreUnEtQuatre(number, resultat);
			resultat = chiffreEntreCinqEtHuit(number, resultat);
			resultat = chiffreNeuf(number, resultat);
		}
		
		if(number.length() == 2){
			
			resultat = "X" + chiffreEntreUnEtQuatre(number.substring(1, 2), resultat);
			//resultat = "X" + chiffreEntreCinqEtHuit(number.substring(1, 2), resultat);
			//resultat = "X" + chiffreNeuf(number.substring(1, 2), resultat);
		}
		
		return resultat;
	}


	private String chiffreNeuf(String number, String resultat) {
		if(number.equals("9")){
			resultat = "IX";
		}
		return resultat;
	}

	
	private String chiffreEntreUnEtQuatre(String number, String resultat) {
		if(number.equals("4")){
			resultat ="IV";
		}
		if(Integer.valueOf(number) >= 1 && Integer.valueOf(number) <= 3) {
			for(int i = 1 ; i <= Integer.valueOf(number) ; i += 1 ){
				resultat += "I";
			}
		}
		return resultat;
	}

	private String chiffreEntreCinqEtHuit(String number, String resultat) {
		if (Integer.valueOf(number) >= 5 && Integer.valueOf(number) <=8){
			resultat = "V";
			if(Integer.valueOf(number) != 5){
				for (int i = 6 ; i <= Integer.valueOf(number) ; i += 1){
					resultat +="I";
				}
			}
		}
		return resultat;
	}	
}
