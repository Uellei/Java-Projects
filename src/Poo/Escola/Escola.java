package Poo.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("ALuno: " + felipe.getNome() + " Idade: " + felipe.getIdade());
    }
}
