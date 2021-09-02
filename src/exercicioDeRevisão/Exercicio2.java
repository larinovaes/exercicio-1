package exercicioDeRevisão;

import java.util.Scanner;

/**
 * Faça um Programa que leia um número e exiba o dia correspondente da
 * semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor
 * inválido.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("1-Domingo");
        System.out.println("2-Segunda");
        System.out.println("3-Terça");
        System.out.println("4-Quarta");
        System.out.println("5-Quinta");
        System.out.println("6-Sexta");
        System.out.println("7-Sabado");
        System.out.println("Escolha um número correspondente a um dia da semana: ");
        int diaCorrespondente = leitor.nextInt();

        if (diaCorrespondente == 1) {
            System.out.println("O seu dia escolhido foi: Domingo");
        } else if (diaCorrespondente == 2) {
            System.out.println("O seu dia escolhido foi: Segunda");
        } else if (diaCorrespondente == 3) {
            System.out.println("O seu dia escolhido foi: Terça");
        } else if (diaCorrespondente == 4) {
            System.out.println("O seu dia escolhido foi: Quarta");
        } else if (diaCorrespondente == 5) {
            System.out.println("O seu dia escolhido foi: Quinta");
        } else if (diaCorrespondente == 6) {
            System.out.println("O seu dia escolhido foi: Sexta");
        } else if (diaCorrespondente == 7) {
            System.out.println("O seu dia escolhido foi: Sabado");
        } else {
            System.out.println("Valor invalido, por favor digitar um numero valido.");
        }

    }
}
