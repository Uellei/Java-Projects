package Excecoes;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("111111111");
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde ao padrão");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) 
            throw new CepInvalidoException();

        return "Cep não formatado";
    }
}
