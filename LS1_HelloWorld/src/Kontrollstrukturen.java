import java.util.Scanner;

public class Kontrollstrukturen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastatur = new Scanner(System.in);
		
		int a;
		//String antwort = "";
		boolean erneut = true; 
		
		while(erneut == true)
		{
		System.out.print("Zustand der Ampel: ");
		a = tastatur.nextInt();
		
		System.out.print(a == 0 ? "gelb\n\n" : a == 1 ? "grün\n\n" : a == 2 ? "rot\n\n" : "Kein gültiger Zustand!\n\n");
		System.out.print("Erneut starten?\n(Ja / Nein)\n\n");
		String antwort = scan.nextLine();
		
		if (antwort == "Ja") {
			erneut = true;
		}
		else {
			erneut = false;
		}
		}
	}
}
