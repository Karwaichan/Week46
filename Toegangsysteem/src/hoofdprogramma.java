
public class hoofdprogramma {
	public static void main(String[] args) {

		Mens mens = new Mens(123);
		Pasje pasje = new Pasje(123);
		Toegangspoort toegang = new Toegangspoort();

		toegang.geefToegang(mens, pasje);

	}
}

class Toegangspoort {

	boolean geefToegang(Mens identificatie, Pasje x) {
		if (x.pasId == identificatie.mensId) {
			System.out.println("Je mag naar binnen");
			return true;
		} else
			System.out.println("Je mag niet naar binnen");
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
}