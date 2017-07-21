package kataFizzBuzz;

public class FizzBuzz {


	public String verifierLeNombre(int i) {
		
		return calculDuRestDeDivision(i);
	}

	private String calculDuRestDeDivision(int i) {
		String resultat ="";
		if(i>0 && i<=100){
			if(i%3==0){
				resultat += "Fizz";
			}
			if (i%5==0){
				resultat += "Buzz";
			}
			if(i%3!=0 && i%5!=0){
				resultat = String.valueOf(i);
			}
		}else resultat = "Erreur";
		return resultat;
		
	}

}
