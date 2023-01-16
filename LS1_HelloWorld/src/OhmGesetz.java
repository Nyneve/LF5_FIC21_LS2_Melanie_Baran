import java.util.Scanner;

public class OhmGesetz 
{
	public static void main (String [] args) 
	{
		Scanner tastatur = new Scanner(System.in);
		
		double R;
		double U;
		double I;
		double ergebnis;
		String gesucht;
		
		
		System.out.print("Was möchten Sie berechnen? R, U oder I?\n");
		gesucht = tastatur.next();
		
		
		switch(gesucht) 
		{
			case "R":
				System.out.print("Bitte geben Sie die Zahl für U ein:\n");
				U = tastatur.nextDouble();
				System.out.print("Bitte geben Sie die Zahl für I ein:\n");
				I = tastatur.nextDouble();
				R = U / I;
				System.out.print("R beträgt " + R);
				break;
			case "U":
				System.out.print("Bitte geben Sie die Zahl für R ein:\n");
				R = tastatur.nextDouble();
				System.out.print("Bitte geben Sie die Zahl für I ein:\n");
				I = tastatur.nextDouble();
				U = R * I;
				System.out.print("U beträgt " + U);
				break;
			case "I":
				System.out.print("Bitte geben Sie die Zahl für U ein:\n");
				U = tastatur.nextDouble();
				System.out.print("Bitte geben Sie die Zahl für R ein:\n");
				R = tastatur.nextDouble();
				I = U / R;
				System.out.print("I beträgt " + I);						
				break;
			default:
				System.out.print("Falsche Eingabe.");
				return;
		}
	}
}
