package TerminalArgumentos;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args){
        // criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Olá me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");

    }
}
