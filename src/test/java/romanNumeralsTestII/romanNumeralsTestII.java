package romanNumeralsTestII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import romanNumeralsII.RomanNumeralsII;

public class romanNumeralsTestII {
	
	@Test
	public void testRomanNumerals(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("I");
		
		assertEquals("1" , "I" , resultat);
	}
	
	@Test
	public void testRomanNumeralsDeux(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("II");
		
		assertEquals("2","II",resultat);
	}
}
