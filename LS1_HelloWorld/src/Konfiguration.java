public class Konfiguration {
	public static void main(String[] args) {

		String name;
		String typ = "Automat AVR";
		String bezeichnung = "Q2021_FAB_A";
		char sprachModul = 'd';
		name = typ + " " + bezeichnung;
		final byte PRUEFNR = 4;
		int muenzenCent = 1280;
		int muenzenEuro = 130;
		int euro;
		int cent;
		double prozent;
		double maximum = 100.00;
		double patrone = 46.24;
		boolean status;
		int summe;
		summe = muenzenCent + muenzenEuro * 100;
		euro = summe / 100;
		prozent = maximum - patrone;
		cent = summe % 100;
		status = (euro <= 150) && (euro >= 50) && (cent != 0) && (sprachModul == 'd') && (prozent >= 50.00) &&  (!(PRUEFNR == 5 || PRUEFNR == 6));
		
		System.out.println("Name: " + name);
		System.out.println("Sprache: " + sprachModul);
		System.out.println("Prüfnummer : " + PRUEFNR);
		System.out.println("Füllstand Patrone: " + prozent + " %");
		System.out.println("Summe Euro: " + euro +  " Euro");
		System.out.println("Summe Rest: " + cent +  " Cent");       
		System.out.println("Status: " + status);
		

}
}











