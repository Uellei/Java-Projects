package AnatomiaDasClasses;
public class MinhaClasse {
    public static void main (String[] args){
    
        String nome = "Weslley Marcelo";
        String sobrenome = "Morais dos Santos";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
