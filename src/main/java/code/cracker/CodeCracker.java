package code.cracker;

import java.util.HashMap;
import java.util.Map;

public class CodeCracker {
	
	private static Map<String,String> cryptage = new HashMap <String,String>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		
		put("a","!");
		put("b",")");
		put("c","\"");
		put("d","(");
	}};
	

	public static String decrypter(String crypte) {
		String decrypter = "";
		if(crypte.length()== 1){
			decrypter = parcourirLeMap(crypte);
		}
		if(crypte.length()!=1){
			for(int i = 0 ; i < crypte.length() ; i++){
				decrypter += parcourirLeMap(crypte.substring(i,i+1));
			}
		}
		return decrypter;
	}


	private static String parcourirLeMap(String crypte) {
		String resultat ="";
		for (Map.Entry<String, String> entry : cryptage.entrySet())
		{
			if(crypte.equals(entry.getValue())){
				resultat = entry.getKey();
			}
		}
		return resultat;
	}

}
