

public class Volumen {

	public static void main(String[] args) {
		System.out.print("Bite geben sie eine Kantenlänge ein:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double ergebnis = wuerfel(a);
		System.out.print(ergebnis);
	}
	
	public static double wuerfel (double a){
		return (a * a * a);
	}
}
