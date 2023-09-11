package EstruturasRepeticao;

public class ExemploFor {
    public static void main(String[] args) {
        String alunos [] = {"Weslley", "Marcelo", "Morais", "Santos"};

        for(int x = 0;x < alunos.length; x ++){
            System.out.println("Aluno no índice x = " + x + " é " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        } // Funciona como um for each
    }
}
