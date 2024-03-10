import java.util.Scanner;

public class exerci5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double raio, area, perimetro;

		// Solicita ao usuário o raio do círculo
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();

		// Calculo
		area = Math.PI * Math.pow(raio, 2);
		perimetro = 2 * Math.PI * raio;

		// Mostra o resultado
		System.out.printf("A área do círculo é: %.2f\n", area);
		System.out.printf("O perímetro do círculo é: %.2f", perimetro);
	}

}
