package Poo.Estabelecimento;

import Poo.Equipamentos.Copiadora.Copiadora;
import Poo.Equipamentos.Digitalizadora.Digitalizador;
import Poo.Equipamentos.Impressora.Deskjet;
import Poo.Equipamentos.Impressora.Impressora;
import Poo.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizador digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
