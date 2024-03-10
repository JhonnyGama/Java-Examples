import java.util.Scanner;

public class exerci9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double pes, polegadas, jardas, milhas;

		// Recebe a medida
		System.out.println("Digite a medida em pés: ");
		pes = sc.nextDouble();

		// Calculo de conversão
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;

		// Mostra os resultados
		System.out.printf("Medida em polegadas: %.2f \n", polegadas);
		System.out.printf("Medida em jardas: %.2f \n", jardas);
		System.out.printf("Medida em milhas: %.2f ", milhas);

	}

}
