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
	public void testDeConversionDuChiffreNeuf(){
		
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(9);
		
		Assert.assertEquals("IX", resultatConversion);
		

	}
	
	@Test
	public void testDeConversionDuChiffreOnze(){
		

		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(11);
		
		Assert.assertEquals("XI", resultatConversion);
		

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
	public void testDeConvesionDuChiffreVingt(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(20);
		
		Assert.assertEquals("XX", resultatConversion);
	}
	@Ignore
	@Test 
	public void testDeConvesionDuChiffreVingtEtUn(){
		RomanNumerals romanNumeral = new RomanNumerals();
		
		String resultatConversion = romanNumeral.conversionDuChiffreEnRomain(21);
		
		Assert.assertEquals("XXI", resultatConversion);
	}
}
