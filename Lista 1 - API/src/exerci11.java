import java.util.Scanner;

public class exerci11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String valor1, valor2, temp;

		// Pede ao usuário dois valores literal
		System.out.print("Digite o primeiro valor literal: ");
		valor1 = sc.nextLine();
		System.out.print("Digite o segundo valor literal: ");
		valor2 = sc.nextLine();

		System.out.println("Antes da troca:\nValor 1: " + valor1 + "\nValor 2: " + valor2);

		// Calculo para troca de variável
		temp = valor1;
		valor1 = valor2;
		valor2 = temp;

		System.out.println("Após a troca:\nValor 1: " + valor1 + "\nValor 2: " + valor2);

	}

}
