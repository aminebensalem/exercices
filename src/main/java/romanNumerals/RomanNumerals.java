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
		conv.put(4, "VI");
		String resultat ="";
		for (Entry<Integer,String> m: conv.entrySet()){
			if(m.getKey()==i){
				resultat = (String) m.getValue();
			}
		}		
		return resultat;
	}

}
