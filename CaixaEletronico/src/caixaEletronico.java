public class caixaEletronico {
    public static void main(String[] args) {

        double saldo = 27.0;
        double valorSolicitado = 26.0; 
        
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println("O saldo é " + saldo);
    }
}

