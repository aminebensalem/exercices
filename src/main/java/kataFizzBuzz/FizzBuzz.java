package kataFizzBuzz;

public class FizzBuzz {


	public String verifierLeNombre(int i) {
		
		return calculDuRestDeDivision(i);
	}

	private String calculDuRestDeDivision(int i) {
		String resultat = null;
		if(i>0 && i<=100){
			if(i%3==0 && i%5!=0){
				resultat = "Fizz";
			}
			else if (i%5==0 && i%3!=0){
				resultat = "Buzz";
			}
			else if (i%5==0 && i%3==0){
				resultat = "FizzBuzz";
			}
			else resultat = String.valueOf(i);
		}
		return resultat;
		
	}

}
