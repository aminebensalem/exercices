package romanNumerals;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TestRomanNumerals {
	
	@Test
	public void testDeConversionDuChiffreUn(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(1);
		
		Assert.assertEquals("I",resultatConversion);
	}
	@Test
	public void testDeConversionDuChiffreDeux(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(2);
		
		Assert.assertEquals("II", resultatConversion);
	}
}
