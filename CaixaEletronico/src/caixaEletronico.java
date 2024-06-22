public class caixaEletronico {
    public static void main(String[] args) {

        double saldo = 30.0;
        double valorSolicitado = 26.0; 
        
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(" O saldo é " + saldo);
            
        } else {
            System.out.println("Saldo insuficiente. O saldo é " + saldo);
        }
    }
}
