package Metodos;

public class Metodos {
    public double somar(int num1, int num2){
        return num1 + num2;
    }
    public void imprimir(String texto){
        System.out.println(texto);
    }
    // throws Exception: indica que o método ao ser utilizado poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{return dividendo/divisor;}

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){}

    
}
