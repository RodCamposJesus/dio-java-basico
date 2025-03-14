package Candidatura;
import java.util.Random;

public class processoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
          }
        }
         static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do { 
                //elas precisaram sofrer alterações
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                tentativasRealizadas++;
                else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            } while (continuarTentando && tentativasRealizadas < 3  );
            if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "TENTATIVA" );
            else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " , NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + "REALIZADA");

        }
         
        //método auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }
        //selecaoDeCandidatos();
        //imprimirSelecionados();
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    
    //static void imprimirSelecionados() {
        
        /*System.out.println("Imprimindo a lista de canidatos informando o índice do elemento");
        for(int indice=0; indice < candidatos.length;indice++) {
            System.out.println("Ocandidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de iteração for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi" + candidato);
        }
    }

    static void selecaoDeCandidatos() {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto",
         "Monica","Fabricio", "Mirela", "Daniela","Jorge"};
         int candidatosSelecionados = 0;
         int candidatosAtual = 0;
         double salarioBase = 2000.0;
         while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
         String candidato = candidatos[candidatosAtual];
         double salarioPretendido = valorPretendido();
         
        System.out.println("O candidato " + candidato + "Solicitou este valor de salário" + salarioPretendido);
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
    /*static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta");
        }else {
            System.out.println("Aguardando resultado demais candidatos"
             + salarioPretendido);
        }*/
    }

