
class Attractie {
	
	String naam;
	double entree;
	int kaartje;
	
	String getNaam() {
		return naam;
	}
	

	 void draaien() { //default mag omdat het een superclass is, subclasses mogen geen kleiner bereik hebben dan de superclass
		System.out.println("Ik ben een attractie die draait");
	}//eind methode draaien
	 double geefPrijs() {
		 return entree;
	 }
	 
	 int geefKaartje() {
		 return kaartje;
	 }
	
}//eind class attractie
