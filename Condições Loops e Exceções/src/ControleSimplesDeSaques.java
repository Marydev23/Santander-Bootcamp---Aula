import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do limite diário de saques
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Leitura do valor do saque
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero para encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // Atualiza o limite diário
                limiteDiario -= valorSaque;

                // Imprime mensagem de saque realizado com sucesso
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
