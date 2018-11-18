
public class LadderKlimmen extends Attractie {

	private String naam = "LadderKlimmen";
	private double entree = 5.00;
	private int kaartje =1;
	
	String getNaam() {
		return naam;
	}
	
	public void draaien() {//override methode draaien() in attractie
		System.out.println("########################################################");
		System.out.println("#De attractie " +naam+ " draait. Sky is the limit..!#");
		System.out.println("########################################################");
	}//einde methode draaien.
	
	double geefPrijs() {
		return entree;
	}
	
	int geefKaartje() {
		return kaartje;
	}

}//einde class LadderKlimmen

