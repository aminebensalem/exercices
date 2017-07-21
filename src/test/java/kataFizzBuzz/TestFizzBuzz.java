package kataFizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {
	@Test
	public void testFizzBuzzdeUn() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		String resultat=fizzBuzz.verifierLeNombre();

		Assert.assertEquals("1", resultat);
	}
	
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

}
