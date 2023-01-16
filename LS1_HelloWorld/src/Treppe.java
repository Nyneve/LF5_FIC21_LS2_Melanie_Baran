import java.util.Scanner;

public class Treppe {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		
		int hoch;
		int breite;
		int gesamtbreite;
		int leerbreite;
		int sternbreite;
		
		System.out.print("Bitte geben Sie eine Treppenhöhe ein: \n");
		hoch = tastatur.nextInt();
		System.out.print("Bitte geben Sie eine Stufenbreite an: ");
		breite = tastatur.nextInt();
		sternbreite = breite;
		
		for (int i = hoch; i > 0; i--) 
		{
			gesamtbreite = breite * i;
			leerbreite = gesamtbreite - breite;
			System.out.print(" ".repeat(leerbreite) + "*".repeat(sternbreite) + "\n");
			sternbreite = sternbreite + breite;
	    }
	}
}