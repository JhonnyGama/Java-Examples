import java.util.Scanner;

public class exerci12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valorSaque, notas100, notas50, notas20, notas10, notas5;

		// valor do saque
		System.out.println("Digite o valor do saque (múltiplo de 5): ");
		valorSaque = sc.nextInt();

		// Calculo para valores de notas
		if (valorSaque % 5 != 0) {
			System.out.println("O valor do saque deve ser múltiplo de 5.");
		} else {

			notas100 = valorSaque / 100;
			valorSaque %= 100;

			notas50 = valorSaque / 50;
			valorSaque %= 50;

			notas20 = valorSaque / 20;
			valorSaque %= 20;

			notas10 = valorSaque / 10;
			valorSaque %= 10;

			notas5 = valorSaque / 5;

			// Mostra a quantidade de cada nota
			System.out.println("Notas de R$100: " + notas100);
			System.out.println("Notas de R$50: " + notas50);
			System.out.println("Notas de R$20: " + notas20);
			System.out.println("Notas de R$10: " + notas10);
			System.out.println("Notas de R$5: " + notas5);
		}

	}

}
