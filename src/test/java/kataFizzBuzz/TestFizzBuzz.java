package kataFizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {
	@Test
	public void testFizzBuzzdeUn() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		String resultat=fizzbuzz.verifierLeNombre();

		Assert.assertEquals("1", resultat);
	}

}
