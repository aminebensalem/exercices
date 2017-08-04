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
		test("1","I");
		test("2","II");
		test("5","V");
		test("8","VIII");
		test("9","IX");
		test("11","XI");
		test("12","XII");
		test("19","XIX");
		test("10","X");
		test("20","XX");
	}
}