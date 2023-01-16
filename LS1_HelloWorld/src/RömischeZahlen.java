import java.util.Scanner;

public class RömischeZahlen 
{
	public static void main (String [] args) 
	{
		Scanner tastatur = new Scanner(System.in);
		
		String zahl;
		
		System.out.print("Bitte geben Sie eine römische Zahl ein:\n");
		zahl = tastatur.next();
		
		switch(zahl) {
			case "I":
				System.out.print("1");
				break;
			case "V":
				System.out.print("5");
				break;
			case "X":
				System.out.print("10");
				break;
			case "L":
				System.out.print("50");
				break;
			case "C":
				System.out.print("100");
				break;
			case "D":
				System.out.print("500");
				break;
			case "M":
				System.out.print("1000");
				break;
			default:
				System.out.print("Falsches Zeichen eingegeben!");
				break;
			
			
		}
	}
}
