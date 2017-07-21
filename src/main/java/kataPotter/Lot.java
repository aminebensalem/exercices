package kataPotter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lot {
	
	private static final int PRIX_TOME = 8;
	private static final double TAUX_REDUCTION_DEUX_LIVRES = 0.05;
	private static final double TAUX_REDUCTION_TROIS_LIVRES = 0.1;
	private static final double TAUX_REDUCTION_QUATRE_LIVRES = 0.2;
	private static final double TAUX_REDUCTION_CINQ_LIVRES = 0.25;
	
	List<String> tomes;
	
	Lot(String... tomes){
		this.tomes = Arrays.stream(tomes).collect(Collectors.toList());
	}

	public double calculeLeMontant() {
		return PRIX_TOME * tomes.size() - calculDeLaReduction();
	}
	
	private double calculDeLaReduction() {
		return PRIX_TOME * tomes.size() * recupererLeTauxDeReduction();
	}
	
	private double recupererLeTauxDeReduction() {
		double tauxReduction;
		if (tomes.size() == 2) {
			tauxReduction = TAUX_REDUCTION_DEUX_LIVRES;
		} else if (tomes.size() == 3) {
			tauxReduction = TAUX_REDUCTION_TROIS_LIVRES;
		} else if (tomes.size() == 4) {
			tauxReduction = TAUX_REDUCTION_QUATRE_LIVRES;
		} else if (tomes.size() == 5) {
			tauxReduction = TAUX_REDUCTION_CINQ_LIVRES;
		} else {
			tauxReduction = 0;
		}
		return tauxReduction;
	}

	public List<String> recupererLesTomes() {
		return tomes;
	}

	public void ajouteLeTome(String tome) {
		tomes.add(tome);
	}
}