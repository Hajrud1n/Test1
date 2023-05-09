
public class Prim {
	

	    public static void main(String[] args) {
	        int x = 19;
	        primNumber(x);
	    }

	    // : 2, 3, 5, 7, 11, 13, 17, 19,

	    static void primNumber(int x) {
	        for (int i = 2; i < x; i++) {
	            if (i % 2 == 1) {
	                System.out.println(i);
	                System.out.println("true");
	            } else {
	                System.out.println();
	            }

	        }
	    }

}

	/*
	 * 2) Die Funktion istPrimzahl( n : int ) : boolean, nimmt positive, ganze
	 * Zahlen entgegen und
	 * soll Prüfen ob es sich dabei um eine Primzahl handelt.
	 * ( Primzahlen sind nur durch 1 und sich selbst, ohne Rest teilbar ).
	 * Gebt true zurück, wenn es sich um eine Primzahl handelt. Ansonsten gebt false
	 * zurück.
	 */


