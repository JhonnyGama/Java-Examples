import java.util.Scanner;

public class exerci10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cateto1, cateto2, hipotenusa;

		// valores dos catetos
		System.out.println("Digite o valor do primeiro cateto: ");
		cateto1 = sc.nextDouble();
		System.out.println("Digite o valor do segundo cateto: ");
		cateto2 = sc.nextDouble();

		// Calculo
		hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

		// Mostra o resultado
		System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);

	}

}
