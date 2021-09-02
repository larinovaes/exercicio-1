package br.com.zup.aula5;

import java.util.Scanner;

/**
 * Faça um programa que leia n números inteiros positivos e calcule a multiplicação desses números.
 */
public class ExercicioTreinamentoMultiplicar {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double numerosDaconta = 0;

        System.out.println("Escolha o numero que deja multiplicar: ");
        double qtdDeNumeros = leitor.nextDouble();

        while (contador <= qtdDeNumeros) {
            System.out.println("Digite o numero " + contador + " :");
            numerosDaconta = leitor.nextDouble();
            numerosDaconta *= numerosDaconta;
            contador++;
        }
        System.out.println("Resultado final: " + numerosDaconta);
    }
}
