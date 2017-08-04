package romanNumeralsTestII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import romanNumeralsII.RomanNumeralsII;

public class romanNumeralsTestII {
	private void test(String entree , String sortie) {
		RomanNumeralsII romanNumerals = new RomanNumeralsII();
	
		String resultat = romanNumerals.convertNumber(entree);
		
		assertEquals(sortie , resultat);
	}
	@Test
	public void testRomanNumerals(){
	
		test("5","V");
		test("8","VIII");
		test("9","IX");
		test("44","XLIV");
		test("50","L");
		test("81","LXXXI");
		test("100","C");
				
	}
}