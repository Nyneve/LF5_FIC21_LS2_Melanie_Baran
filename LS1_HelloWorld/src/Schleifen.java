
public class Schleifen {

	public static void main(String[] args) {

		//Quadratzahlen 10 bis 20
		System.out.println("Quadratzahlen von 10 bis 20:");
		for(int i=10; i<=20; i++) {
		      System.out.printf("%d ", i*i);
		}
		
		System.out.println("\n");
		
		System.out.println("Quadratzahlen von 10 bis 20, 11 wird übersprungen, ab 18 abgebrochen:");
		int i = 10;
		while(i <= 20) {
		    i++;
			if (i == 11) continue;
			System.out.printf("%d ", i*i);
			if (i == 18) break;
		}
	
	
	
	}

}
