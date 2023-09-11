package Metodos;

public class Usuario {
    public static void main(String[] args){
        SmartTV smartTv = new SmartTV();

        smartTv.aumentarVolume();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
    }
}
