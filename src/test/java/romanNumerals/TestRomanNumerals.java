package romanNumerals;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;



public class TestRomanNumerals {
	
	@Test
	public void testDeConversionDuChiffreUn(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(1);
		
		Assert.assertEquals("I",resultatConversion);
	}
	
	@Ignore
	@Test
	public void testDeConversionDuChiffreDeux(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(2);
		
		Assert.assertEquals("II", resultatConversion);
	}
	@Ignore
	@Test
	public void testDeConversionDuChiffreTrois(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(3);
		
		Assert.assertEquals("III", resultatConversion);
	}
	@Ignore
	@Test
	public void testDeConversionDuChiffreQuatre(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(4);
		
		Assert.assertEquals("IV", resultatConversion);
	}
}
