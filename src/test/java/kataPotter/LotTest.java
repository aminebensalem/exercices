package kataPotter;

import org.junit.Assert;
import org.junit.Test;

public class LotTest {
	
	private static final double DELTA = 0.01;

	@Test
	public void jePeuxCalculerLePrixDUnLotVide(){
		Lot lot = new Lot();
		
		double total = lot.calculeLeMontant();
		
		Assert.assertEquals(0, total, DELTA);
	}
	
	@Test
	public void jePeuxCalculerLePrixDUnLotComptantUnTome(){
		Lot lot = new Lot("tome1");
		
		double total = lot.calculeLeMontant();
		
		Assert.assertEquals(8, total, DELTA);
	}
	
	@Test
	public void jePeuxCalculerLePrixDUnLotComptantDeuxTomes(){
		Lot lot = new Lot("tome1", "tome2");
		
		double total = lot.calculeLeMontant();
		
		Assert.assertEquals(15.2, total, DELTA);
	}

}
