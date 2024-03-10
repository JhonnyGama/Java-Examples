import java.math.*;
import java.util.Scanner;

public class exerci7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a, b, c, delta, x1, x2;

		// Coeficientes
		System.out.println("Digite o valor de A, B e C");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println(delta);

		// verifica se o delta é negativo
		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
		} else {

			// Calcula as raízes da equação
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			// Mostra o resultado
			System.out.println("As raízes da equação são:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}

	}

}
