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
	public void testFizzBuzzDuNombreUn(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String resultat=fizzBuzz.verifierQueLeNombreEstUnFizz();
		Assert.assertEquals("Fizz", resultat);
	}

}
