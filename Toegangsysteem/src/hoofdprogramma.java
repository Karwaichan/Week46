
public class hoofdprogramma {
	public static void main(String[] args) {

		Mens mens = new Mens(123);
		Pasje pasje = new Pasje(1234);
		Toegangspoort toegang = new Toegangspoort();

		//toegang.geefToegang(mens, pasje);
		if(toegang.geefToegang(mens, pasje) == false) {
			System.out.println("COMPUTER SAYS NO! -Je mag niet naar binnen!-");
			System.out.println("pasje wordt geblokkeert");
		}else
			System.out.println("Goedgekeurd!");
			System.out.println("Welkom");
		
		
	}
}

class Toegangspoort {

	boolean geefToegang(Mens identificatie, Pasje x) {
		if (x.pasId == identificatie.mensId) {
			//System.out.println("Je mag naar binnen");
			return true;
		} else
			//System.out.println("Je mag niet naar binnen");
		return false;
	}

}

class Mens {
	int mensId;

	Mens(int i) {
		mensId = i;
	}

}

class Pasje {
	int pasId;

	Pasje(int i) {
		pasId = i;
	}
	
//	void pasjeBlokkeren() {
//		if(toegang.geefToegang(mens, pasje) == false) {
//			System.out.println("pasje wordt geblokkeert");
//		}else
//			System.out.println("Kom binnen");
//	}
}