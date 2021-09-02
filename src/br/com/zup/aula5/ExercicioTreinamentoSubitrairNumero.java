package br.com.zup.aula5;

import java.util.Scanner;

/**
 * Faça um programa que leia n números positivos e calcule a subitração desses números.
 */
public class ExercicioTreinamentoSubitrairNumero {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double numerosDigitadosPorUsuario = 0;

        System.out.println("Digite a quanditade de números que deseja calcular");
        double qtdDeNumeros = leitor.nextDouble();

        while (contador <= qtdDeNumeros) {
            System.out.println("DIgite o numero " + contador + " :");
            numerosDigitadosPorUsuario = -leitor.nextDouble();
            contador++;
        }
        System.out.println("Resultado final será igual a: " + numerosDigitadosPorUsuario);
    }
}
