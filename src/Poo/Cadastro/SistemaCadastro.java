package Poo.Cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123", "Marcos");
        marcos.setEndereco("Rua Antonio");

        System.out.println("Pessoa: " + marcos.getNome() + " CPF: " + marcos.getCpf() + " Endereco: " + marcos.getCpf());


    }
}
