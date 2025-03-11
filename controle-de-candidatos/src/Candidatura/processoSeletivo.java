package Candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    }

    static void selecaoDeCandidatos() {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto",
         "Monica","Fabricio", "Mirela", "Daniela","Jorge"};
         int candidatosSelecionados = 0;
         int candidatosAtual = 0;
         double salarioBase = 2000.0;
         while (candidatosSelecionados < 5) {
         String candidato = candidatos[candidatosAtual];
         double salarioPretendido = valorPretendido();
         
        System.out.println("O candidato " + candidato + "Solicitou este valor de salário");
        if(salarioBase >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
             }
           candidatosAtual++;
           }
        }
         static double valorPretendido(){
            return  ThreadLocalRandom.current().nextDouble(1800,2200);
         
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta");
        }else {
            System.out.println("Aguardando resultado demais candidatos"
             + salarioPretendido);
        }
    }
}
