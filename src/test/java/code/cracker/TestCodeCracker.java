package code.cracker;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestCodeCracker {
	
	private void test(String decrypte, String crypte) {
		assertEquals(decrypte,CodeCracker.decrypter(crypte));
	}
	
	@Test
	public void leCodeDeLaLettreA(){
		test("a","!");
	}

	@Test
	public void testDeCryptageDeB(){
		test("b", ")");
	}
	
	@Test
	public void testDeCryptageDeC(){
		test("c","\"");
	}
	
	@Test
	public void testDeCryptageAEtB(){
		test("ab","!)");
	}
	
	@Test
	public void testDeCryptageAEtA(){
		test("aa","!!");
	}
	
	@Test
	public void testDeCryptageABEtC(){
		test("abc","!)\"");
	}
	
	@Test
	public void testDeCryptageBCAEtD(){
		test("bcad",")\"!(");
	}
}
