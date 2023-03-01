import java.util.Locale;
import java.util.Scanner;

public class Condicional2 {

	


	    public static void main(String[] args) {

	        Locale.setDefault(Locale.US);
	        Scanner leia = new Scanner(System.in);

	        double ladoA = leia.nextDouble();
	        double ladoB = leia.nextDouble();
	        double ladoC = leia.nextDouble();
	        double valorA = 0;
	        double valorB = 0;
	        double valorC = 0;

	        if (ladoC > ladoB && ladoC > ladoA) {
	            valorA = ladoA;
	            valorB = ladoB;
	            valorC = ladoC;
	            ladoA = ladoC;
	            if (ladoB > ladoA) {
	                ladoC = valorA;
	            } else {
	                ladoB = valorA;
	                ladoC = valorB;
	            }
	        } else if (ladoB > ladoA && ladoB > ladoC) {
	            valorA = ladoA;
	            valorB = ladoB;
	            valorC = ladoC;
	            ladoA = valorB;
	            if (ladoC > ladoA) {
	                ladoB = valorC;
	                ladoC = valorA;
	            } else {
	                ladoB = valorA;
	                ladoC = valorC;
	            }
	        } else {
	            valorA = ladoA;
	            valorB = ladoB;
	            valorC = ladoC;
	            ladoB = valorC;
	            ladoC = valorB;
	        }


	        if (ladoA >= (ladoB + ladoC)) {
	            System.out.println("NAO FORMA TRIANGULO");
	        } else if (Math.pow(ladoA, 2) == ((Math.pow(ladoB, 2) + Math.pow(ladoC, 2)))) {
	            System.out.println("TRIANGULO RETANGULO");
	            if (ladoA == ladoB && ladoA == ladoC) {
	                System.out.println("TRIANGULO EQUILATERO");
	            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
	                System.out.println("TRIANGULO ISOSCELES");
	            }
	        } else if (Math.pow(ladoA, 2) > ((Math.pow(ladoB, 2) + Math.pow(ladoC, 2)))) {
	            System.out.println("TRIANGULO OBTUSANGULO");
	            if (ladoA == ladoB && ladoA == ladoC) {
	                System.out.println("TRIANGULO EQUILATERO");
	            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
	                System.out.println("TRIANGULO ISOSCELES");
	            }
	        } else if (Math.pow(ladoA, 2) < ((Math.pow(ladoB, 2) + Math.pow(ladoC, 2)))) {
	            System.out.println("TRIANGULO ACUTANGULO");
	            if (ladoA == ladoB && ladoA == ladoC) {
	                System.out.println("TRIANGULO EQUILATERO");
	            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
	                System.out.println("TRIANGULO ISOSCELES");
	            }
	        }
	    }
	}