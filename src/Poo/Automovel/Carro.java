package Poo.Automovel;

public class Carro extends Veiculo{
    public void ligar() {
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
}
