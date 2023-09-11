package ControleCandidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Weslley", "Waldemar", "Walter", "Uellei", "Oelisso"};
        for(String candidato: candidatos) {
            entrarContato(candidato);
        }
    }

    static void entrarContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTANTO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("Não CONSEGUIMOS CONTATO COM " + candidato);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Weslley", "Waldemar", "Walter", "Uellei", "Oelisso"};

        for(int indice = 0;indice < candidatos.length;indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada com for each");
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos () {
        String [] candidatos = {"Weslley", "Waldemar", "Walter", "Wellington", "Weber", "Oelisson", "Uellei", "Marcelo", "Morais", "Santos"};
        int candidatosSelecionaos = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionaos < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPRetendido();
            System.out.println("Candidato: " + candidato + " Salário Pretendido: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("Candidato: " + candidato + " foi selecionado");
                candidatosSelecionaos++;
            }
            candidatoAtual++;
        }
    }

    static double valorPRetendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
