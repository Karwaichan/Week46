
public class Hawaii extends Attractie {
	
	private String naam = "Hawaii";
	private double entree = 2.90;
	private int kaartje =1;
	
	String getNaam() {
		return naam;
	}
	
	public void draaien() {//override methode draaien() in attractie
		System.out.println("############################################");

		System.out.println("#De attractie " +naam+ " draait. Aloha.aaaah..!#");
		System.out.println("############################################");

	}//einde methode draaien.
	
	double geefPrijs() {
		return entree;
	}

	int geefKaartje() {
		return kaartje;
	}
}//einde class Hawaii


