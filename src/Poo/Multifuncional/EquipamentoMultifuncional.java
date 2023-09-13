package Poo.Multifuncional;

import Poo.Equipamentos.Copiadora.Copiadora;
import Poo.Equipamentos.Digitalizadora.Digitalizador;
import Poo.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizador, Impressora{
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNICONAL");
    }

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNICONAL");
    }
}
