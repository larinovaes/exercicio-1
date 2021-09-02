package exercicioDeRevisão;

import java.util.Scanner;

public class Exercicia3 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero que deja multiplicar: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " +(numero*i));
        }
    }
}
