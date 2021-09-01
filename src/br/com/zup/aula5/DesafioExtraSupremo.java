package br.com.zup.aula5;

import java.util.Scanner;

public class DesafioExtraSupremo {
    public static void main(String[] args) {
        /** Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre:
         O menor valor
         O maior valor
         A soma dos valores.
         */


        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double menorValor = 0;
        double maiorValor = 0;
        double somaDosValores = 0;


        System.out.println("Dige quantos numeros deseja calcular");
        double qtdDeNumeros = leitor.nextDouble();
        System.out.println("Digite seu número 1:");
        double numerosDigitadoPeloUsuario = leitor.nextDouble();
        maiorValor = numerosDigitadoPeloUsuario;
        menorValor = numerosDigitadoPeloUsuario;


        while (contador <= qtdDeNumeros) {
            System.out.println("Digite seu numero " +contador+ " :");
            numerosDigitadoPeloUsuario = leitor.nextDouble();

            if (numerosDigitadoPeloUsuario > maiorValor) {
                maiorValor = numerosDigitadoPeloUsuario;

            } else if (numerosDigitadoPeloUsuario < maiorValor) {
                menorValor = numerosDigitadoPeloUsuario;
            }
            double todosOsValores = maiorValor + menorValor;
            somaDosValores = numerosDigitadoPeloUsuario + todosOsValores ;
            contador++;
        }
        System.out.println("Menor valor vai ser iqual a: " + menorValor);
        System.out.println("Maior valor vai ser igual a: " + maiorValor);
        System.out.println("Total do valores é: " + somaDosValores);

    }

}

