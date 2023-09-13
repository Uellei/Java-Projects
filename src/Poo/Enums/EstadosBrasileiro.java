package Poo.Enums;

public enum EstadosBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JNEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "MAranhão");

    private String nome;
    private String sigla;

    private EstadosBrasileiro (String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
