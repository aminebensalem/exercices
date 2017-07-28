package romanNumerals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumerals {

	public String conversionDuChiffreEnRomain(int i) {
		Map<Integer,String> conv = new HashMap<Integer,String>();
		conv.put(1, "I");
		conv.put(2, "II");
		conv.put(3, "III");
		conv.put(4, "IV");
		conv.put(5, "V");
		conv.put(6, "VI");
		conv.put(7, "VII");
		conv.put(8, "VIII");
		conv.put(9, "IX");
		conv.put(10, "X");
		String resultat ="";
		if (i>0 && i<= conv.size()){
			resultat = parcourirUnMap(i, conv, resultat);
		}
		if (i>conv.size()){
			i=i-conv.size();
			resultat="X";
			resultat = parcourirUnMap(i, conv, resultat);
		}
		return resultat;
	}

	private String parcourirUnMap(int i, Map<Integer, String> conv, String resultat) {
		for(Entry<Integer,String> m: conv.entrySet()){
			if(m.getKey()==i){
				resultat+=(String) m.getValue();
			}
		}
		return resultat;
	}
	

}
