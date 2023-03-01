import java.util.Locale;
import java.util.Scanner;

public class Repetitiva3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        double nota1 = leia.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = leia.nextDouble();
        }

        double nota2 = leia.nextDouble();

        while (nota2 < 0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = leia.nextDouble();
        }

        double calculoMedia = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f",calculoMedia);
    }
}