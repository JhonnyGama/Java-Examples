import java.util.Scanner;
public class exerci8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pesoSacoKg,quantidadeDiariaPorGato,pesoSacoG,restante,consumoTotal;
		
        // Recebendo o peso do saco de ração em quilogramas
        System.out.println("Digite o peso do saco de ração em quilogramas (Kg): ");
        pesoSacoKg = sc.nextDouble();
        System.out.println("Digite a quantidade de ração fornecida para cada gato por dia em gramas (g): ");
        quantidadeDiariaPorGato = sc.nextInt();

        // Calculo
        consumoTotal = (quantidadeDiariaPorGato * 2) * 5;
        pesoSacoG = pesoSacoKg * 1000;
        restante = pesoSacoG - consumoTotal;

        // Mostra o resultado
        System.out.println("Após cinco dias, restarão " + restante + " gramas de ração no saco.");

	}

}
