package nombrePremier;

public class NombrePremier {

	public static String estPremier(int nombre) {	
		return 	nombrePremierOuNon(determinerLeResteDeDivision(nombre));
	}

	
	private static String nombrePremierOuNon(boolean alerteResteDeDivision) {
		String resultat;
		if(alerteResteDeDivision == true){
			resultat = "nonPremier";
		}
		else resultat = "estPremier";
		return resultat;
	}

	private static boolean determinerLeResteDeDivision(int nombre) {
		boolean resteDeDiv = false;
		if(nombre == 0 || nombre ==1){
			resteDeDiv = true;
		}
		int i = 2;
		while(i < nombre){
			if(nombre%i == 0){
				resteDeDiv = true;
				break;
			}		
			i++;			
		}
		return resteDeDiv;
	}
}
