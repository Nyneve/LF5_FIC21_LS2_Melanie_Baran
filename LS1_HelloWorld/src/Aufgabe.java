
public class Aufgabe {
	public static void main(String[] args) {
		//Aufgabe 1.4
		int ergebnis = (4+8)*(9-1);
		System.out.print("Ergebnis: " + ergebnis);
		
		int zaehler = 1;
		zaehler++;
		System.out.print("\nZähler: " + zaehler);
		
		int division = 22/6;
		System.out.print("\nDivison: " + division);
		
		String zeichenkette = "\n\nMeine Oma " + "fährt im " + "Hühnerstall Motorrad.";
		System.out.print(zeichenkette);
		
		//Operatoren Aufgabe 3
		int schalter = 10;
		boolean logik = (schalter > 7) && (schalter < 12);
		System.out.print("\n\nDer Vergleich ist " + logik + "\n");
		System.out.print(schalter != 10 || schalter == 12);
	}

}
