
public class Spookhuis extends Attractie {

	private String naam = "Spookhuis";
	private double entree = 3.20;
	private int kaartje =1;
	
	String getNaam() {
		return naam;
	}

	public void draaien() {// override methode draaien() in attractie
		System.out.println("##################################################################################");
		System.out.println("#De attractie " + naam + " draait. There is something strange in the neighborhood...#");
		System.out.println("##################################################################################");

	}// einde methode draaien.

	double geefPrijs() {
		return entree;
	}

	int geefKaartje() {
		return kaartje;
	}
}// einde class Spookhuis
