import java.util.Scanner;

public class exerci2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double salario, aumento, novoSalario;

		// Solicita ao usuário o nome do funcionário
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();

		// Solicita ao usuário o salário do funcionário
		System.out.println("Digite o salário do funcionário: ");
		salario = sc.nextDouble();

		// Calculo
		aumento = salario * 0.25;
		novoSalario = salario + aumento;

		// Mostra o resultado
		System.out.printf("O funcionário %s recebeu um aumento de R$%.2f. Seu novo salário é R$%.2f.", nome, aumento,
				novoSalario);
	}

}
