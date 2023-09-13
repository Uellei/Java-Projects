package Poo.Cadastro;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // Método construtor
    // O nome deve ser igual ao nome da classe
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String newEndereco) {
       this.endereco = newEndereco;
    }
}
