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
		conv.put(20, "XX");
		conv.put(30, "XXX");
		conv.put(40, "XL");
		conv.put(50, "L");
		conv.put(60, "LX");
		conv.put(70, "LXX");
		conv.put(80, "LXXX");
		conv.put(90, "XC");
		conv.put(100, "C");
		String resultat ="";
		
		resultat = parcourirUnMap(i, conv);
		
		return resultat;
	}

	
	private String parcourirUnMap(int i, Map<Integer, String> conv) {
		String resultat = "" ;
		String chiffreUnitaireRomain = "";
		String chiffreDizaineRomain="";
		for(Entry<Integer,String> m: conv.entrySet()){
			if(m.getKey()==i){
				return resultat=(String) m.getValue();
			}
		
		}
		
		int i1 = Integer.parseInt(Integer.toString(i).substring(Integer.toString(i).length()-2,Integer.toString(i).length()-1)+"0");
		int i2 = Integer.parseInt(Integer.toString(i).substring(Integer.toString(i).length()-1,Integer.toString(i).length()));

		for(Entry<Integer,String> m:conv.entrySet()){
			if(m.getKey()==i1){
				chiffreDizaineRomain=(String) m.getValue();
			}
			if(m.getKey()==i2){
				chiffreUnitaireRomain=(String) m.getValue();
			}
		
		}
		
		return resultat=chiffreDizaineRomain+chiffreUnitaireRomain;
	}
	

}
