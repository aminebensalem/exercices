package kataPotter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Panier {

	List<Lot> lots = new ArrayList<Lot>();

	public Panier(String... tomes) {
		A: for (String tome : tomes) {
			for (Lot lot : lots) {
				if (!lot.recupererLesTomes().contains(tome)) {
					lot.ajouteLeTome(tome);
					continue A;
				}
			}
			lots.add(new Lot(tome));
		}
	}

	public double calculeLeMontant() {
		return lots.stream().collect(Collectors.summingDouble(Lot::calculeLeMontant));
	}
}