package TipoVariaveis;

public class TipoVariaveis {
    public static void main(String[] args){
        /* Primitive Types
        int, byte, shor, long, float, double, boolean and char - esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória.(Memory Stack)
        Tipo | Memória | Valor Mínimo              | Valor Máximo
        byte   1 byte    -128                        127
        short  2 byte    -32.768                     32.767
        int    4 bytes   -2.147.483.648              2.147.483.647
        long   8 bytes   -9.223.372.036.854.775.808  9.223.372.036.854.775.807

        Tipos com partes fracionárias
        Tipo   | Memória | Valor Mínimo  | Valor Máximo
        float    4 bytes   -3,4028 + 38    3,4028 + 38
        double   8 bytes   -1,7976 + 308   1,7976 + 308 

        Estrutura para declarar uma variável:
        <Tipo> <NomeVariavel> <AtribuicaoOpcional>
         */
       float pi = 3.14F; // Tipo float precisa colocar F no final, seja maiúsculo ou minúsculo

       /* Constantes
        São valores armazenados em memória que não podem ser modificados depois de declarados. Em java, esses valores são representados pela palavra reservada "final", seguida do tipo.
        Por convenção, Constantes são sempre escritas em CAIXA ALTA.
       */
      final double VALOR_DE_PI = 3.14;
    }
}
