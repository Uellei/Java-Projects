package Collections.List.CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    
    private List<Item> carrinhoCompra;

    public CarrinhoDeCompra() {
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        carrinhoCompra.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!carrinhoCompra.isEmpty()) {
            for(Item i : carrinhoCompra) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhoCompra.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double soma = 0;
        if(!carrinhoCompra.isEmpty()){
             for(Item item : carrinhoCompra) {
                double valor = item.getPreco() * item.getQuantidade();
                soma += valor;
            }
        return soma;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
           
    }

    public void exibirItens() {
        if(!carrinhoCompra.isEmpty()){
            System.out.println(this.carrinhoCompra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
            // Criando uma instância do carrinho de compras
    CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
