package diamond;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestDiamond {
	@Test
	public void afficherUnA(){
		assertEquals("A", Diamond.afficherDiamond("A"));
	}

	@Test
	public void afficherUnDiamondB(){
		String resultat = " A \n"
						+ "B B\n"
						+ " A ";
		assertEquals(resultat,Diamond.afficherDiamond("B"));
	}
	
	@Test
	public void afficherUnDiamondC(){
		String resultat = "  A  \n"
						+ " B B \n"
						+ "C   C\n"
						+ " B B  \n"
						+ "  A   ";
		assertEquals(resultat,Diamond.afficherDiamond("C"));
	}
	
	@Test
	public void afficherUnDiamondD(){
		String resultat = "   A   \n"
						+ "  B B  \n"
						+ " C   C \n"
						+ "D     D\n"
						+ " C   C \n"
						+ "  B B  \n"
						+ "   A   ";
		assertEquals(resultat,   Diamond.afficherDiamond("D")); 
	}
	
	@Test 
	public void afficheA(){
		assertEquals("A",Diamond.afficherChaineDeCaractere("A"));
	}
	
	@Test 
	public void afficheABBA(){
		assertEquals("ABBA",Diamond.afficherChaineDeCaractere("B"));
	}
	
	@Test 
	public void afficheABCCBA(){
		assertEquals("ABCCBA",Diamond.afficherChaineDeCaractere("C"));
	}
	@Ignore
	@Test 
	public void afficheABCDDCBA(){
		assertEquals("ABCDDCBA",Diamond.afficherChaineDeCaractere("D"));
	}
	
	
}