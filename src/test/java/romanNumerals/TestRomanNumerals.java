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
	
	@Test
	public void testDeconversionDuChiffreDouze(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(12);
		
		Assert.assertEquals("XII", resultatConversion);
	}
	
	@Test
	public void testDeConversionDuChiffreDixNeuf(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(19);
		
		Assert.assertEquals("XIX", resultatConversion);
	}
	
	@Test
	public void testDeConversionDuChiffreCent(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(100);
		
		Assert.assertEquals("C", resultatConversion);
	}
	
	@Test
	public void testDeConversionDuChiffreCentUn(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(101);
		
		Assert.assertEquals("CI", resultatConversion);
	}
	
}
