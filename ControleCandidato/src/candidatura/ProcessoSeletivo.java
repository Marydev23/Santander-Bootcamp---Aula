package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecionarCandidato();
        String[] candidatos = {"FELIPE", "JULIA", "MARIA", "JOAO","CAMILA"};
       
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
        	
        }
        
    }
    
    static void entrandoEmContato (String candidato) {
    	int tentativaRealizada =1;
    	boolean continuarTentando = true;
    	boolean atendeu = false;
    	do {
    		atendeu = atender();
    		continuarTentando = !atendeu;
    		
    		if (continuarTentando)
    			tentativaRealizada++;
    		else
    			System.out.println("Contato realizado com sucesso");
    		
    	}while (continuarTentando && tentativaRealizada <3);
    	
    	if (atendeu)
    		System.out.println("Conseguimos contato com " + candidato +  " na tentativa"  + tentativaRealizada);
    	else
    		System.out.println("Não conseguimos contato");
    	
    }
    
    static boolean atender() {
    	return new Random().nextInt(3)== 1;
    }

    static void selecionarCandidato() {
        String[] candidatos = {"FELIPE", "JULIA", "MARIA", "JOAO"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatoSelecionados++;
            }

            candidatoAtual++;
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato da proposta ");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
