import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de horas MEI");
        // Entradas
        Scanner teclado = new Scanner(System.in);
        
        // Pedir o nome do Analista
        System.out.println("Digite o nome do analista");
        String nomeAnalista = teclado.nextLine();

        // Pedir o salário pretendido
        System.out.println("Digite o salário pretendido");
        double salarioPretendido = teclado.nextDouble();

        teclado.close();

        // Processamento
        double salarioHora = (salarioPretendido * 2) / (7 * 20);

        // Saída
        System.out.printf("O analista %s deverá cobrar %.2f por hora", nomeAnalista, salarioHora);

        
    }
}
