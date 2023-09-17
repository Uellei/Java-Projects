package Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdeancaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdeancaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoaList.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoarPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoarPorIdade);
        return pessoarPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdeancaoPessoa ordenacaoPessoas = new OrdeancaoPessoa();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.pessoaList);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }
}
