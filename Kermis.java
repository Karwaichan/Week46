import java.util.Scanner;

public class Kermis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cijfer = 0;
		int aantalKaartenTotaal = 0;
		int botsKaartenTotaal = 0;
		int spinKaartenTotaal =0;
		int spiegelpaleisKaartenTotaal =0;
		int spookhuisKaartenTotaal =0;
		int hawaiiKaartenTotaal = 0;
		int ladderklimmenKaartenTotaal =0;
		double omzet = 0;
		
//		Attractie [] attracties = new Attractie [6]; //zie pagina 427
//		attracties[0] = new Botsautos();
//		attracties[1] = new Spin();
//
//		attracties[2] = new Spiegelpaleis();
//		attracties[3] = new Spookhuis();
//		attracties[4] = new Hawaii();
//		attracties[5] = new LadderKlimmen();
//		for(Attractie attractie: attracties) {//loop door de array
//			if(attractie instanceof Botsautos) {//Hij doet iets zodra hij Botsautos object vind in de array
//				System.out.println("ik heb botsautos gevonden in de array");
//			}
//			if(attractie instanceof Spin) {
//				System.out.println("ik heb de spin in de array gevonden.");
//			}
//		}
		
		Attractie botsauto = new Botsautos(); //type van superclass is mogelijk door polyformie
		Attractie spin = new Spin();
		Attractie spiegelpaleis = new Spiegelpaleis();
		Spookhuis spookhuis = new Spookhuis();
		Hawaii hawaii = new Hawaii();
		LadderKlimmen ladderklimmen = new LadderKlimmen();
		
		boolean doorgaan = true;
		System.out.println("\t########################");
		System.out.println("\t#-Welkom bij de Kermis-#");
		System.out.println("\t########################");
		
		opnieuw:
		while(doorgaan) {//for-loop om door de switch keuze te loopen
			System.out.println("\nKEUZEMENU:");
			System.out.println("1:Botsautos \t2:Spin \t\t3:spiegelpaleis \t4:spookhuis");
			System.out.println("5:Hawaii \t6:Ladderklimmen 'k':Kaarten verkocht \t'o':Omzet");
			System.out.println("\n0:Ga naar huis.");
			
			//int keus = Integer.parseInt(scanner.nextLine());
			String keus = scanner.nextLine();
			
			try {
				cijfer = Integer.parseInt(keus);
			}catch(NumberFormatException String){
				if("o".equals(keus)) {
					System.out.println("Totale omzet vandaag is: " + omzet + " Euro.");
					continue opnieuw;
				}
				else if("k".equals(keus)) {
					System.out.println("Attractie " + botsauto.getNaam() + " heeft " + botsKaartenTotaal + " ticket(s) verkocht.");
					System.out.println("Attractie " + spin.getNaam() + " heeft " + spinKaartenTotaal + " ticket(s) verkocht.");
					System.out.println("Attractie " + spiegelpaleis.getNaam() + " heeft " + spiegelpaleisKaartenTotaal + " ticket(s) verkocht.");
					System.out.println("Attractie " + spookhuis.getNaam() + " heeft " + spookhuisKaartenTotaal + " ticket(s) verkocht.");
					System.out.println("Attractie " + hawaii.getNaam() + " heeft " + hawaiiKaartenTotaal + " ticket(s) verkocht.");
					System.out.println("Attractie " + ladderklimmen.getNaam() + " heeft " + ladderklimmenKaartenTotaal + " ticket(s) verkocht.");

					System.out.println("\nEr zijn totaal " + aantalKaartenTotaal + " kaarten verkocht.");
					continue opnieuw;
				}else System.out.println("COMPUTER SAYS NO! (Maak een keuze uit het menu, alstublieft.)");
					continue opnieuw;
			}
			
			switch (cijfer) {
			case 0:
				System.out.println("Bedankt voor het komen en tot ooit!");

				System.out.println("Je hebt: " + omzet + " Euro uitgegeven.");
				doorgaan = false;
				break;
			case 1:
				botsauto.draaien();
				double botsPrijs = botsauto.geefPrijs();
				int botsKaartje = botsauto.geefKaartje();
				aantalKaartenTotaal += botsKaartje;
				botsKaartenTotaal += botsKaartje;
				omzet = omzet + botsPrijs;
				break;
			case 2:
				spin.draaien();
				double spinPrijs = spin.geefPrijs();
				int spinKaartje = spin.geefKaartje();
				aantalKaartenTotaal += spinKaartje;
				spinKaartenTotaal += spinKaartje;
				omzet = omzet + spinPrijs;
				break;
			case 3:
				spiegelpaleis.draaien();
				double spiegelPrijs = spiegelpaleis.geefPrijs();
				int spiegelKaartje = spiegelpaleis.geefKaartje();
				aantalKaartenTotaal += spiegelKaartje;
				spiegelpaleisKaartenTotaal += spiegelKaartje;
				omzet = omzet + spiegelPrijs;
				break;
			case 4:
				spookhuis.draaien();
				double spookPrijs = spookhuis.geefPrijs();
				int spookKaartje = spookhuis.geefKaartje();
				aantalKaartenTotaal += spookKaartje;
				spookhuisKaartenTotaal += spookKaartje;
				omzet = omzet + spookPrijs;
				break;
			case 5:
				hawaii.draaien();
				double hawaiiPrijs = hawaii.geefPrijs();
				int hawaiiKaartje = hawaii.geefKaartje();
				aantalKaartenTotaal += hawaiiKaartje;
				hawaiiKaartenTotaal += hawaiiKaartje;
				omzet = omzet + hawaiiPrijs;
				break;
			case 6:
				ladderklimmen.draaien();
				double ladderklimmenPrijs = ladderklimmen.geefPrijs();
				int ladderklimmenKaartje = ladderklimmen.geefKaartje();
				aantalKaartenTotaal += ladderklimmenKaartje;
				ladderklimmenKaartenTotaal += ladderklimmenKaartje;
				omzet = omzet + ladderklimmenPrijs;
				break;
			default:
				System.out.println("COMPUTER SAYS NO! (Maak een keuze uit het menu, alstublieft.)");
			}// einde switch
		

		}//einde while-loop
		
	}//einde main

}//einde class kermis
