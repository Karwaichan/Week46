
public class Spin extends Attractie {
	private String naam = "Spin";
	private double entree = 2.25;
	private int kaartje =1;
	
	String getNaam() {
		return naam;
	}
	
	public void draaien() {//override methode draaien() in attractie
		System.out.println("#############################################################");
		System.out.println("#De attractie " +naam+ " draait. Ik spin totdat je misselijk bent.#");
		System.out.println("#############################################################");
	}//einde methode draaien.
	
	double geefPrijs() {
		return entree;
	}
	
	int geefKaartje() {
		return kaartje;
	}
}//einde class Spin
