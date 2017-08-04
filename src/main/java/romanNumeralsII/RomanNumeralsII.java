package romanNumeralsII;

public class RomanNumeralsII {

	public String convertNumber(String number) {
		String resultat = "";
		String decimal = "";
		if(number.length() == 1){
			resultat = chiffreEntreUnEtQuatre(number, resultat);
			resultat = chiffreEntreCinqEtHuit(number, resultat);
			resultat = chiffreNeuf(number, resultat);
		}
		
		if(number.length() == 2){
			
			resultat = chiffreEntreUnEtQuatre(number.substring(1, 2), resultat);
			resultat = chiffreEntreCinqEtHuit(number.substring(1, 2), resultat);
			resultat = chiffreNeuf(number.substring(1, 2), resultat);
			resultat = dixVingtEtTrentre(number, resultat, decimal);
			resultat = quarante(number, resultat);
			resultat = deCinquanteAQuatreVingt(number, resultat);
			if(Integer.valueOf(number.substring(0,1)) == 9){
				resultat = "XC" + resultat;
			}
		}
		return resultat;
	}


	private String deCinquanteAQuatreVingt(String number, String resultat) {
		String decimal;
		if (Integer.valueOf(number.substring(0,1)) >= 5 && Integer.valueOf(number.substring(0,1)) <=8){
			decimal = "L";
			if(Integer.valueOf(number.substring(0,1)) != 5){
				int nb = Integer.valueOf(number.substring(0,1));
				for (int i = 6 ; i <= nb ; i++){
					decimal += "X";
				}
			}
			resultat = decimal + resultat ;
		}
		return resultat;
	}


	private String quarante(String number, String resultat) {
		if(Integer.valueOf(number.substring(0,1)) == 4){
			resultat = "XL" + resultat;
		}
		return resultat;
	}


	private String dixVingtEtTrentre(String number, String resultat, String decimal) {
		if (Integer.valueOf(number.substring(0,1)) >= 1 && Integer.valueOf(number.substring(0,1)) <=3){
			for (int i = 1 ; i <= Integer.valueOf(number.substring(0,1)) ; i+=1){
				decimal += "X";
			}
			resultat = decimal + resultat;		
		}
		return resultat;
	}


	private String chiffreNeuf(String number, String resultat) {
		if(number.equals("9")){
			resultat += "IX";
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
