public class ArrayUebung {
			  public static void main(String args[]) {

			    // 1. Deklaration eines Arrays für ganze Zahlen.
				int ganzezahlen [];
				  
			    // 2. Initialisierung des Arrays mit 100 Elementen.
				ganzezahlen = new int[100];
						  
				System.out.print("\n\n------------- 3. Aufgabe -------------\n\n");
				
			    // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
				for (int index = 0; index < ganzezahlen.length; index++) {
					System.out.print(ganzezahlen[index]);
				}
						
				System.out.print("\n\n------------- 4. Aufgabe -------------\n\n");
				
			    // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
				for (int index = 0; index < ganzezahlen.length; index++) {
					ganzezahlen[index] = (index+1);
					System.out.print(ganzezahlen[index] + "\n");
				}
				
				System.out.print("\n\n------------- 5. Aufgabe -------------\n\n");
				
			    // 5. Geben Sie den Wert an der Stelle 89 des Arrays aus.          
				System.out.print("Index 89: " + ganzezahlen[89] + "\n\n");
				
				System.out.print("\n\n------------- 6. Aufgabe -------------\n\n");
				
			    // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
				System.out.print("Index 49 vor Änderung: " + ganzezahlen[49] + "\n");
				ganzezahlen[49] = 1060;
				System.out.print("Index 49 nach Änderung: " +ganzezahlen[49] + "\n\n");				
			    // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2020.
				System.out.print("Erster Index vor Änderung: " + ganzezahlen[0] + "\n");				ganzezahlen[49] = 1060;
				System.out.print("Letzter Index vor Änderung: " +ganzezahlen[(ganzezahlen.length-1)] + "\n\n");
				ganzezahlen[0] = 2020;
				ganzezahlen[(ganzezahlen.length-1)] = 2020;
				System.out.print("Erster Index nach Änderung: " + ganzezahlen[0] + "\n");
				System.out.print("Letzter Index nach Änderung: " + ganzezahlen[(ganzezahlen.length-1)] + "\n\n");
				
				System.out.print("\n\n------------- 7. Aufgabe -------------\n\n");
				
			    // 7. Erneutes ausgeben des Arrayinhalts.
				// Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
				for (int index = 0; index < ganzezahlen.length; index++) {
					System.out.print("Index " + index + " - Inhalt " + ganzezahlen[index] + "\n");
				}
				
				System.out.print("\n\n------------- 8. Aufgabe -------------\n\n");
				
				// 8. Berechnung des Durchschnitts aller Arrayelemente
					double summe = 0;
					for (int i = 0; i < ganzezahlen.length; i++)
						summe += ganzezahlen[i];
					double avg = summe/100; 
					System.out.print(avg);
			  }
			}
