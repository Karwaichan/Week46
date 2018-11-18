
class Botsautos extends Attractie{//Botsautos IS-A Attractie
	private String naam = "Botsautos";
	private double entree = 2.50;
	private int kaartje =1;
	
	String getNaam() {
		return naam;
	}
	
	public void draaien() { //override van methode in attractie
		System.out.println("################################################################");
		System.out.println("#De attractie " + naam + " draait. Achteruit rijden is gevaarlijk.#");
		System.out.println("################################################################");

		
	}//einde methode draaien
	
	double geefPrijs() {
		return entree;
	}
	
	int geefKaartje() {
		return kaartje;
	}
	
}//einde class botsautos
