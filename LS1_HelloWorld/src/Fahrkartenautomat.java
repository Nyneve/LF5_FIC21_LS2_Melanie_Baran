import java.util.Scanner;

class Fahrkartenautomat {
	
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag = 0.0;
		int AnzahlTicket;
		int ausgesuchteKarte;
		boolean karte = false;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;

		// 1 Fahrkarte aussuchen. Bei ungültiger Eingabe wiederholt sich die Schleife.  
		while (karte == false) 
		{
			System.out.print("Fahrkartenbestellvorgang:\r\n"
					+ "=========================\r\n\n"
					+ "Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\r"
					+ "Kurzstrecke AB [2,00 Euro] (1)\r"
					+ "Einzelfahrschein AB [3,00 Euro] (2)\r"
					+ "Tageskarte AB [8,80 Euro] (3)\r"
					+ "4-Fahrten-Karte AB [9,40 Euro] (4)\n\n");
			
			ausgesuchteKarte = tastatur.nextInt();
			
			if (ausgesuchteKarte < 1 || ausgesuchteKarte > 4)
			{
				System.out.print(">>> Bitte wählen Sie eine gültige Ausgabe. <<<\n");
			}
			
			switch(ausgesuchteKarte)
			{
				case 1: 
				zuZahlenderBetrag = 2.00; 
				karte = true;
				break;
				case 2:
				zuZahlenderBetrag = 3.00;
				karte = true;
				break;
				case 3: 
				zuZahlenderBetrag = 8.80;
				karte = true;
				break;
				case 4:
				zuZahlenderBetrag = 9.40;
				karte = true;
				break;
			}
		}
		
		//AUFGABE A4.2:
		//Ticketanzahl wird eingegeben, bei ungültiger Eingabe wiederholt sich die Schleife:
		AnzahlTicket = 0; 
		while (AnzahlTicket < 1 ||  AnzahlTicket > 10)
		{
			System.out.print("Anzahl der Fahrkarten: ");
			AnzahlTicket = tastatur.nextInt();
			if (AnzahlTicket < 1 || AnzahlTicket > 10)
			{
				System.out.print(">>> Fehlerhafte Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 10 ein.<<<\n\n");
			}
		}		
		
		zuZahlenderBetrag = zuZahlenderBetrag * AnzahlTicket;
		
		// 2 Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) 
		{
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlender Betrag: %.2f Euro\n",nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			if (eingeworfeneMuenze != 0.05 && eingeworfeneMuenze != 0.1 && eingeworfeneMuenze != 0.2 && eingeworfeneMuenze != 0.5 && eingeworfeneMuenze != 1 && eingeworfeneMuenze != 2 && eingeworfeneMuenze != 5 && eingeworfeneMuenze != 10 && eingeworfeneMuenze != 20 ) 
			{
				System.out.print("Kein gültiger Zahlungsbetrag. Bitte erneut versuchen.\n\n");
			}
			else
			{
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			}
		}
		
		// 3 Fahrscheinausgabe
		/*if (AnzahlTicket == 1) {
		System.out.println("\nFahrschein wird ausgegeben");
		} else {
			System.out.println("\nFahrscheine werden ausgegeben");
		}*/
		
		//Verkürzung:
			System.out.println(AnzahlTicket == 1 ? "\nFahrschein wird ausgegeben" : "Fahrscheine werden ausgegeben");
		for (int i = 0; i < 8; i++) 
		{
			System.out.print("=");
			try 
			{
				Thread.sleep(200);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
		// 4 Rückgeldberechnung und -ausgabe
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) 
		{
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) 
			{ // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) 
			{ // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.49) 
			{ // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.19) 
			{ // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.09) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.049) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
			while (rueckgabebetrag >= 0.009) { // 1-Cent-Münzen
				System.out.println("1 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.01;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
}