
public class Modulo {
	


	public static void main(String[] args) {
	        int x = 10;
	        summe(x);
	    }

	    static void summe(int x) {
	        // System.out.println(x);
	        int s = 0;
	        for (int i = 0; i < x; i++) {
	            // System.out.println(i);
	            if (i % 2 == 1) {
	                System.out.println(i);
	                s += i;
	            }
	        }
	        System.out.print("Die Summe ist : ");
	        System.out.print(s);

	    }
	

}
