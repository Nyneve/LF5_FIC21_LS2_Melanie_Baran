import java.util.Scanner;

public class Monate {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner tastatur = new Scanner(System.in);
		
		int monat;
		
		System.out.print("Bitte geben Sie eine Zahl zwichen 1 und 12 ein:\n");
		monat = tastatur.nextInt();
		System.out.print(monat == 1 ? "Januar" : monat == 2 ? "Februar" : monat == 3 ? "März" : monat == 4 ? "April" :monat == 5 ? "Mai" :monat == 6 ? "Juni" :monat == 7 ? "Juli" :monat == 8 ? "August" :monat == 9 ? "September" :monat == 10 ? "Oktober" :monat == 11 ? "November" :monat == 12 ? "Dezember" : "");

	}
}



