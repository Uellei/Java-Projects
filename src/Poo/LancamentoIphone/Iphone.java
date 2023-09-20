package Poo.LancamentoIphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void exibirPagina() {
       System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Adicioanndo aba");
    }

    @Override
    public void tocar() {
       System.out.println("tocando");
    }

    @Override
    public void pausar() {
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
       System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("ligando");
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
       System.out.println("Coreeio de voz");
    }
}
