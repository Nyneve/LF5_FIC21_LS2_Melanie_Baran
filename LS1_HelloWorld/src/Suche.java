import java.util.Scanner;
public class Suche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] zahlenarray = {1, 5, 5, 7, 3, 11, 22, 23, 27};
		System.out.print("Bitte geben sie die gesuchte Zahl ein:");
		int gesucht = sc.nextInt();
		boolean gefunden = false; 
		
		for (int i = 0; i <= zahlenarray.length-1; i++) {
			if (gesucht == zahlenarray[i]) {
				gefunden = true;
				break;
			}
		}
				
		if (gefunden == true) {
			System.out.print("Gefunden!");
		}
		else {
			System.out.print("Nicht gefunden.");
			}
		}
	}