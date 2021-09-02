package exercicioDeRevisão;

import java.util.Scanner;
/**
 * Os números primos possuem várias aplicações dentro da Computação, por
 * exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um
 * e por ele mesmo. Faça um programa que peça um número inteiro e determine se
 * ele é ou não um número primo.
 */
public class Exercicio4 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroPrimo = 0;

        System.out.println("Digite o número que deseja saber se é primo:");
        int numeroDigitadoPorUsuario = leitor.nextInt();

        if (numeroDigitadoPorUsuario % 1 == 0 && numeroDigitadoPorUsuario % numeroDigitadoPorUsuario == 0){
            numeroPrimo++;
            System.out.println("Esse número é primo");
        }
    }
}

