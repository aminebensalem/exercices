package romanNumeralsTestII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import romanNumeralsII.RomanNumeralsII;

public class romanNumeralsTestII {
	
	@Test
	public void testRomanNumerals(){
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
		
		String resultat = romanNumerals.convertNumber();
		
		assertEquals("1" , "I" , resultat);
	}
}
