import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Lê a entrada que informa o saldo inicial da conta
        double saldo = Double.parseDouble(br.readLine());

        // Lê a entrada com a quantidade total de transações
        int quantidadeTransacoes = Integer.parseInt(br.readLine());

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê a entrada com o tipo de transação (D para depósito ou S para saque)
            char tipoTransacao = br.readLine().toUpperCase().charAt(0);
            // Lê a entrada com o valor da transação
            double valorTransacao = Double.parseDouble(br.readLine());

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibe o saldo final
        System.out.println("Saldo: " + saldo);

        // Exibe a lista de transações
        System.out.println("Transacoes:");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }
    }
}
