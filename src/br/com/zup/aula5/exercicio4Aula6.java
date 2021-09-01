package br.com.zup.aula5;

import java.util.Scanner;

public class exercicio4Aula6 {
    public static void main(String[] args) {
        /* Faça um programa que leia n números inteiros positivos e calcule a soma desses números.*/

        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double numerosDigitados = 0;

        System.out.println("Digite quantidade de numeros que deseja Calcular");
        double qtdDeNumeros = leitor.nextInt();

        while (contador <= qtdDeNumeros){
            System.out.println("Digite seu numero " + contador + " :");
            numerosDigitados += leitor.nextDouble();
            contador++;
        }

        System.out.println("A soma dos numeros é igual a: " + numerosDigitados);

    }
}
