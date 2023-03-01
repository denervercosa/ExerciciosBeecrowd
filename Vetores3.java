import java.util.Locale;
import java.util.Scanner;

public class Vetores3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	        Scanner leia = new Scanner(System.in);

	        Double[] A = new Double[10];

	        for (int i = 0; i < A.length; i++) {
	            double x = leia.nextDouble();
	            A[i] = x;
	        }

	        for (int i = 0; i < A.length; i++) {
	            if (A[i] <= 10) {
	                System.out.println("A[" + i + "]" + " = " + A[i]);
	            }
	        }
	    }
	}