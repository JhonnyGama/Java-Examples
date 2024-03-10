import java.math.*;

public class exerci6 {

	public static void main(String[] args) {

		// Coeficientes
		double a = 1;
		double b = -5;
		double c = 6;

		// Calcula o delta
		double delta = Math.pow(b, 2) - 4 * a * c;

		// Calcula as raízes da equação
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		// Mostra o resultado
		System.out.println("As raízes da equação x^2 - 5x + 6 = 0 são:");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}
}