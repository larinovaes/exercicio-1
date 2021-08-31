package Aula6;

import java.util.Scanner;

public class exercicio2Aula6 {
    public static void main(String[] args) {
        // Faça um programa que leia números inteiros e imprima sua média
        Scanner leitor = new Scanner(System.in);

        double media = 0;
        double soma = 0;
        int contador = 1;
        double notasDeUsuario;

        System.out.println("Quantos numeros deseja  saber a media?");
        int numerosInteiros = leitor.nextInt();

        while (contador <= numerosInteiros){
            System.out.println("Por favor, digite sua nota:");
            notasDeUsuario = leitor.nextDouble();
            contador++;
            soma = soma + notasDeUsuario;
            media = soma/numerosInteiros;
        }
        System.out.println("Sua media é igual a: " + media);
    }
}
