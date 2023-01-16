//Eingabe
import java.util.Scanner; //Importiert die Klasse Scanner, die das Einlesen von Tastatureingaben ermöglicht.
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double zahl1, zahl2, summe, differenz, produkt, quotient, rest; //Initialisiert die Variablen.
		Scanner tastatur = new Scanner(System.in); //Erzeugt das Objekt Scanner.
		System.out.print("Bitte geben Sie eine Zahl ein: "); //Gibt den Text in "" aus.
		zahl1 = tastatur.nextDouble(); //Setzt die Variable zahl1 auf die Tastatureingabe.
		System.out.print("Bitte geben Sie eine zweite Zahl ein: "); //Gibt de Text in "" aus.
	//Verarbeitung
		zahl2 = tastatur.nextDouble(); //Setzt die Variable zahl2 auf die Tastatureingabe.
		summe = zahl1 + zahl2; //Setzt die Variable summe auf die Summe aus den Variablen zahl1 und zahl2.
		differenz = zahl1 - zahl2; //Setzt die Variable differenz auf die Differenz aus den Variablen zahl1 und zahl2.
		produkt = zahl1 * zahl2; //Setzt die Variable produkt auf das Produkt aus den Variablen zahl1 und zahl2.
		quotient =  zahl1 / zahl2; //Setzt die Variable quotient auf den Quotienten aus den Variablen zahl1 und zahl2.
		rest = zahl1%zahl2;
	//Ausgabe
		System.out.println("\nSumme: " + summe + "\nDifferenz: " + differenz + "\nProdukt: " + produkt + "\nQuotient: " + quotient + "\nRest: " + rest); //Gibt den Text in "" und die Variable ergebnis aus.
		tastatur.close(); //Beendet das Einlesen von Tastatureingaben.
		
	}

}
