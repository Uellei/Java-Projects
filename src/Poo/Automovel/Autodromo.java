package Poo.Automovel;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi(null);

        Veiculo coringa = z400;
        coringa.ligar();
    }
}
