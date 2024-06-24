import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SimulacaoBancaria {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            String input = br.readLine();
            if (input == null) {
                break; // Termina se não houver mais entrada
            }

            int opcao = Integer.parseInt(input.trim());

            switch (opcao) {
                case 1:
                    // Ler o valor a ser depositado
                    double valorDeposito = Double.parseDouble(br.readLine().trim());
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 2:
                    // Ler o valor a ser sacado
                    double valorSaque = Double.parseDouble(br.readLine().trim());
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // Exibir o saldo atual
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0:
                    // Encerrar o programa
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
