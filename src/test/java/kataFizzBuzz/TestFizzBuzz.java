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
	public void testFizzDuNombreUn(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierQueLeNombreEstUnFizz();
		Assert.assertEquals("Fizz", resultat);
	}
	@Test
	public void testFizzDeUn(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultat=fizzBuzz.verifierQueLeNombreEstUnFizz(1);
		Assert.assertEquals("Fizz", resultat);
	}

}
