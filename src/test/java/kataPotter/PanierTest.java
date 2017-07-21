package kataPotter;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PanierTest {

	private static final double DELTA = 0.01;

	@Test
	public void jePeuxCalculerLePrixDUnPanierVide() {
		Panier panier = new Panier();

		double total = panier.calculeLeMontant();

		Assert.assertEquals(0, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantUnTome() {
		Panier panier = new Panier("tome1");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(8, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantDeuxTomesIdentiques() {
		Panier panier = new Panier("tome1", "tome1");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(16, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantTroisTomesIdentiques() {
		Panier panier = new Panier("tome1", "tome1", "tome1");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(24, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantQuatreTomesIdentiques() {
		Panier panier = new Panier("tome1", "tome1", "tome1", "tome1");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(32, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantCinqTomesIdentiques() {
		Panier panier = new Panier("tome2", "tome2", "tome2", "tome2", "tome2");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(40, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantDeuxTomesDifferents() {
		Panier panier = new Panier("tome1", "tome2");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(15.2, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantTroisTomesDifferents() {
		Panier panier = new Panier("tome1", "tome2", "tome3");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(21.6, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantQuatreTomesDifferents() {
		Panier panier = new Panier("tome1", "tome2", "tome3", "tome4");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(25.6, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantCinqTomesDifferents() {
		Panier panier = new Panier("tome1", "tome2", "tome3", "tome4", "tome5");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(30, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantTroisTomesDontDeuxIdentiques() {
		Panier panier = new Panier("tome1", "tome2", "tome1");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(23.2, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantQuatreTomesDontDeuxIdentiques() {
		Panier panier = new Panier("tome1", "tome2", "tome1", "tome3");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(29.6, total, DELTA);
	}

	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantQuatreTomesDontDeuxPairesIdentiques() {
		Panier panier = new Panier("tome1", "tome2", "tome1", "tome2");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(30.4, total, DELTA);
	}

	@Ignore
	@Test
	public void jePeuxCalculerLePrixDUnPanierComptantHuitTomesDontTroisPairesIdentiquesEtDeuxAutresDifferents() {
		Panier panier = new Panier("tome1", "tome1", "tome2", "tome2", "tome3", "tome3", "tome4", "tome5");

		double total = panier.calculeLeMontant();

		Assert.assertEquals(51.2, total, DELTA);
	}
}