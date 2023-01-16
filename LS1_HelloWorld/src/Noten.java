import java.util.Scanner;

public class Noten {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner tastatur = new Scanner(System.in);
		
		int note;
		
		System.out.print("Bitte geben Sie eine Note von 1 bis 6 ein:");
		note = tastatur.nextInt();
		System.out.print(note == 1 ? "Sehr gut" : note == 2 ? "Gut" : note == 3 ? "Befriedigend" : note == 4 ? "Ausreichend" : note == 5 ? "Mangelhaft" : note == 6 ? "Ungenügend" : "Falsche Eingabe!");

	}
}