
public class Random {
	

		//
	    public static void main(String[] args) {

	        naechsteZufallsZahl();
	    }

	    static void naechsteZufallsZahl() {
	        int wuerfallNumber = 6;
	        int i = 0;
	        // while (wuerfallNumber != 1 || wuerfallNumber != 6) {
	        for (i = 0; i < wuerfallNumber; i++) {
	            // System.out.println(i);
	            if (wuerfallNumber == 1 || wuerfallNumber == 6) {
	                System.out.println("Gewonnen");
	                break;
	            } else {
	                System.out.println("Falsch");
	            }
	        }
	        // }
	    }
}

	/*
	 * 
	 * 2) Macht zunächst eine Zuweisung, indem Ihr der Variable wuerfelZahl : int
	 * einen sinnvollen
	 * Zufallswert. Dazu könnt Ihr die Funktion naechsteZufallsZahl() : int
	 * verwenden.
	 * Wiederholt den Vorgang so oft, bis eine 1 oder eine 6 von naechsteZufallsZahl
	 * zurückgegeben wird.
	 * 
	 */



