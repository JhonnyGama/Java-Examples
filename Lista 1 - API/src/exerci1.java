import java.util.Scanner;

public class exerci1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, m, calc1, calc2;
		int alunos1, alunos2, alunos3;

		// Solicita ao usuário nota e peso
		System.out.println("Qual a primeira nota?");
		nota1 = sc.nextDouble();
		System.out.println("Quantos alunos obtiveram ela?");
		alunos1 = sc.nextInt();
		System.out.println("Qual a segunda nota?");
		nota2 = sc.nextDouble();
		System.out.println("Quantos alunos obtiveram ela?");
		alunos2 = sc.nextInt();
		System.out.println("Qual a terceira nota?");
		nota3 = sc.nextDouble();
		System.out.println("Quantos alunos obtiveram ela?");
		alunos3 = sc.nextInt();

		// Calculo
		calc1 = (alunos1 * nota1) + (alunos2 * nota2) + (alunos3 * nota3);
		calc2 = alunos1 + alunos2 + alunos3;
		m = calc1 / calc2;

		// Mostra o resultado
		System.out.printf("A média ponderada entre os alunos é %.1f", m);

	}

}
