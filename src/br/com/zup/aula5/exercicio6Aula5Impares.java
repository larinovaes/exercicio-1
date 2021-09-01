package br.com.zup.aula5;

import java.util.Scanner;

public class exercicio6Aula5Impares {
    public static void main(String[] args) {
        /**Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar
         * a quantidade de números ímpares desses números.
         */

        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double qtdDeNumerosImpares = 0;

        System.out.println("Digite a quantidade de numeros que deja:");
        double numerosImpares = leitor.nextDouble();

        while (contador <= numerosImpares) {
            System.out.println("Digite o número " + contador + " :");
            double numeroDoUsuario = leitor.nextDouble();

            if (numeroDoUsuario % 2 == 0) {
                qtdDeNumerosImpares += 1;
            }
            contador++;
        }
        System.out.println("A quantidade de numeros impares é igual a: " + qtdDeNumerosImpares);
    }
}
