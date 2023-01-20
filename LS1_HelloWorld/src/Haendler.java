import java.util.Scanner;
public class Haendler {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Benutzereingaben lesen
        System.out.println("was möchten Sie bestellen?");
        String artikel = myScanner.next();
        System.out.println("Geben Sie die Anzahl ein:");
        int anzahl = myScanner.nextInt();
        System.out.println("Geben Sie den Nettopreis ein:");
        double preis = myScanner.nextDouble();
        System.out.println("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
        double mwst = myScanner.nextDouble();
       
        // Verarbeiten
        double nettogesamtpreis = anzahl * preis;
        double bruttogesamtpreis = nettogesamtpreis * (1 + mwst / 100);

        // Ausgeben
        System.out.println("\tRechnung");
        System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }
}


//Einbauen:
public static String liesString(String text)
public static int liesInt(String text)
public static double liesDouble(String text)
public static double berechneGesamtnettopreis(int anzahl, double nettopreis)
public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst)
public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst)