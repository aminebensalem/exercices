package romanNumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

	public String conversionDuChiffreEnRomain(int i) {
		Map<Integer,String> conv = new HashMap<Integer,String>();
		conv.put(1, "I");
		String resultat ="";
		for(Map.Entry m:conv.entrySet()){
			resultat = (String) m.getValue();
		}
		return resultat;
	}

}
