import java.util.Locale;
import java.util.Scanner;

public class ImputOutput {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        final double pi = 3.14159;

        double raio = leia.nextDouble();

        double calculoArea = pi * Math.pow(raio,2);

        System.out.printf("A= %.4f",calculoArea);
    }


	}


