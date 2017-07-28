package romanNumerals;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TestRomanNumerals {
	
	@Test
	public void testDeConversionDuChiffreUn(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreRomain(1);
		
		Assert.assertEquals("I",resultatConversion);
	}
}
