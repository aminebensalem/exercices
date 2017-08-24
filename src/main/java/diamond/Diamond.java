package diamond;

public class Diamond {

	public static String afficherDiamond(String lettre) {
		String resultat = "";
		
		
		if(lettre.equals("D")){
			resultat = "   A   \n"
					 + "  B B  \n"
					 + " C   C \n"
					 + "D     D\n"
					 + " C   C \n"
					 + "  B B  \n"
					 + "   A   ";
		}
		if(lettre.equals("C")){
			resultat = "  A  \n"
					 + " B B \n"
					 + "C   C\n"
					 + " B B  \n"
				 	 + "  A   ";
		}
		if(lettre.equals("B")){
			resultat =  " A \n"
					 +  "B B\n"
				 	 +  " A ";
		}
		if (lettre.equals("A")){
			resultat = "A";
		}
		return resultat;
	}
	
	public static String alphabet [] = {"A","B","C","D"};
	static String resultat = "";
	public static String afficherChaineDeCaractere(String lettre) {
		if(lettre.equals("A")){
			return "A";
		} 
		else {
			for (int i = 0 ; i <= alphabet.length ; i++){
				if(!alphabet[i].equals(lettre)){
					resultat += alphabet[i] ;
					
				}
				else if(alphabet[i].equals(lettre)){
					resultat += lettre;
					i = 4;
				}
				
			}
		}
		
		StringBuffer reverse = (new StringBuffer(resultat)).reverse();
		resultat += reverse;
		return resultat;
	}
}
