import java.util.Scanner;

public class exerci4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		
		// Solicita ao usuário a base do triângulo
		System.out.println("Digite a base do triângulo: ");
		base = sc.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		altura = sc.nextDouble();

		// Calculo
		area = (base * altura) / 2;

		// Mostra o resultado
		System.out.printf("A área do triângulo é: %.2f", area);
	}

}
