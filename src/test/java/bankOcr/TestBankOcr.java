package bankOcr;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestBankOcr {
	@Test
	public void jeVeuxAfficherUn(){
		assertEquals(1, BankOcr.convertisseur("  |\n  |\n"));
	}
	
	@Test
	public void jeVeuxAfficherDeux(){
		assertEquals(2, BankOcr.convertisseur(" _ \n _|\n|_ \n"));
	}
	
	@Test
	public void jeVeuxAfficherTrois(){
		assertEquals(3, BankOcr.convertisseur(" _ \n _|\n _|\n"));
	}
	
	@Test
	public void jeVeuxAfficherQuatre(){
		assertEquals(4, BankOcr.convertisseur("|_|\n  |\n"));
	}

}
