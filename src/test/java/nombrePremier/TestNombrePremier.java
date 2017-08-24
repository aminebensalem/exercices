package nombrePremier;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestNombrePremier {
	private void test(String resultat, int nombre) {
		assertEquals(resultat, NombrePremier.estPremier(nombre));
	}
	
	
	@Test
	public void deuxNombrePremier(){
		test("estPremier",2);
	}
	
	@Test
	public void troisNombrePremier(){
		test("estPremier",3);
	}
	
	@Test
	public void quatreNonPremier(){
		test("nonPremier",4);
	}
	
	@Test
	public void cinqNombrePremier(){
		test("estPremier",5);
	}
	
	@Test
	public void huitNonPremier(){
		test("nonPremier",8);
	}
	
	@Test
	public void zeroEtUnNonPremier(){
		test("nonPremier",0);
		test("nonPremier",1);
	}
	@Test
	public void quatreVingtsDixSeptNombrePremier(){
		test("estPremier", 97);
	}
}
