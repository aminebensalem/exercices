package romanNumeralsTestII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import romanNumeralsII.RomanNumeralsII;

public class romanNumeralsTestII {
	
	@Test
	public void testRomanNumerals(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("1");
		
		assertEquals("I" , resultat);
	}
	
	@Test
	public void testRomanNumeralsDeux(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("2");
		
		assertEquals("II",resultat);
	}
	
	@Test
	public void testRomanNumeralsTrois(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("3");
		
		assertEquals("III",resultat);
	}
	
	@Test
	public void testRomanNumeralsQuatre(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("4");
		
		assertEquals("IV",resultat);
	}
	@Test
	public void testRomanNumeralsCinq(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber("5");
		
		assertEquals("VI",resultat);
	}
}