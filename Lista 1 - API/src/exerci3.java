import java.util.Scanner;

public class exerci3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salarioBruto, gratificacao, salarioComGratificacao, desconto,salarioLiquido;
		
		// Solicita ao usuário o salário bruto do funcionário
		System.out.println("Digite o salário bruto do funcionário: ");
		salarioBruto = sc.nextDouble();

		// Calculo
		gratificacao = salarioBruto * 0.10;
		salarioComGratificacao = salarioBruto + gratificacao;
		desconto = salarioComGratificacao * 0.15;
		salarioLiquido = salarioComGratificacao - desconto;

		// Mostra o resultado
		System.out.printf("O salário líquido do funcionário é R$%.2f.", salarioLiquido);

	}

}
