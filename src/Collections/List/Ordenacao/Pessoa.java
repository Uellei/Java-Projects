package Collections.List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa{Nome: '" + nome + "', " + "Idade: " + idade + ", Altura: " + altura + "}";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }

}
