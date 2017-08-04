package romanNumeralsTestII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import romanNumeralsII.RomanNumeralsII;

public class romanNumeralsTestII {
	
	@Test
	public void testRomanNumerals(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("1");
		
		assertEquals("1" , "I" , resultat);
	}
	
	@Test
	public void testRomanNumeralsDeux(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("2");
		
		assertEquals("2","II",resultat);
	}
	
	@Test
	public void testRomanNumeralsTrois(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("3");
		
		assertEquals("3","III",resultat);
	}
}