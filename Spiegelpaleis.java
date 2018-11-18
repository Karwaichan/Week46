
public class Spiegelpaleis extends Attractie {
	private String naam = "SpiegelPaleis";
	private double entree = 2.75;
	private int kaartje =1;
	
	String getNaam() {
		return naam;
	}
	
	public void draaien() {//override methode draaien() in attractie
		System.out.println("#####################################################################");
		System.out.println("#De attractie " +naam+ " draait. Ik zie ik zie wat jij niet ziet.#");
		System.out.println("#####################################################################");
	}//einde methode draaien.
	
	double geefPrijs() {
		return entree;
	}
	
	int geefKaartje() {
		return kaartje;
	}
}//einde class Spiegelpaleis



