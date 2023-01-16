import java.util.Scanner;

public class Taschenrechner 
{
	public static void main (String [] args) 
	{
		Scanner tastatur = new Scanner(System.in);
		
		String rechenart;
		double zahl1;
		double zahl2;
		double ergebnis;
		
		
		System.out.print("Bitte geben Sie die erste Zahl ein:\n");
		zahl1 = tastatur.nextDouble();
		System.out.print("Bitte geben Sie die zweite Zahl ein:\n");
		zahl2 = tastatur.nextDouble();
		System.out.print("Bitte geben Sie die Rechenart (+ oder - oder * oder /)  ein:\n");
		rechenart = tastatur.next();
		
		switch(rechenart) 
		{
			case "+":
				ergebnis = zahl1 + zahl2;
				break;
			case "-":
				ergebnis = zahl1 - zahl2;
				break;
			case "*":
				ergebnis = zahl1 * zahl2;						
				break;
			case "/":
				ergebnis = zahl1 / zahl2;							
				break;
			default:
				System.out.print("Falsches Zeichen eingegeben!");
				return;
		}
		
		System.out.printf("Das Ergebnis ist: %.2f", ergebnis );
	}
}
