package candidatura;

import java.util.Random;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {
       String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
       for(String candidato : candidatos){
        entrandoEmContato(candidato);
       }
    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando= !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
                
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
                
            }

        } while (continuarTentando && tentativasRealizadas < 3);
     
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
            
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
        }
    }


    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for( int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
            
        }else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS ");
        }
    }
    
}
