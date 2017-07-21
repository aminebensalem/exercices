package kataFizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {
	
	@Test
	public void testFizzDeUn(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultat=fizzBuzz.verifierLeNombre(1);
		Assert.assertEquals("1", resultat);
	}
	@Test
	public void testDuNombredeux(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierLeNombre(2);
		
		Assert.assertEquals("2", resultat);
	}
	@Test
	public void testDuNombreTrois(){
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierLeNombre(3);
		
		Assert.assertEquals("Fizz", resultat);
	}
	@Test
	public void testDuNombreNeuf(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierLeNombre(9);
		
		Assert.assertEquals("Fizz", resultat);
	}
	@Test
	public void testDuNombreCinq(){
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierLeNombre(5);
		
		Assert.assertEquals("Buzz", resultat);
	}
	@Test
	public void testDuNombreDix(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierLeNombre(10);
		
		Assert.assertEquals("Buzz", resultat);
	}
	@Test
	public void testDuNombreQuinze(){
		FizzBuzz fizzBuzz =new FizzBuzz();
		
		String resultat = fizzBuzz.verifierLeNombre(15);
		
		Assert.assertEquals("FizzBuzz", resultat);
	}
	@Test
	public void testDuNombreSoixante(){
		FizzBuzz fizzBuzz =new FizzBuzz();
		
		String resultat = fizzBuzz.verifierLeNombre(60);
		
		Assert.assertEquals("FizzBuzz", resultat);
	}
}
