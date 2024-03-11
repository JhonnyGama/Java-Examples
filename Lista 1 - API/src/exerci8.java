import java.util.Scanner;
public class exerci8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pesoSacoKg,quantidadeDiariaPorGato,consumoTotal;
		
        // Recebendo o peso do saco de ração em quilogramas
        System.out.println("Digite o peso do saco de ração em quilogramas (Kg): ");
        pesoSacoKg = sc.nextDouble();
        System.out.println("Digite a quantidade de ração fornecida para cada gato por dia em gramas (g): ");
        quantidadeDiariaPorGato = sc.nextDouble();
        
        // Calculo
        consumoTotal = pesoSacoKg - quantidadeDiariaPorGato / 1000 * 2 * 5;
        
        // Mostra o resultado
        System.out.printf("Após cinco dias, restarão %.2f KG de ração no saco.", consumoTotal);

	}

}
