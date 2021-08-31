package br.com.zup.aula5;

import java.util.Scanner;

public class exercicio4Aula5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        double numerosleitor;
        int contador = 0;

        System.out.println("Digite a quantidade de números tiradas no semestre para calcular a media");
        numerosleitor = leitor.nextDouble();

        while (contador < numerosleitor) {
            System.out.println("Digite sua nota: ");
            double notasDoAluno = leitor.nextDouble();
            contador++;
            soma = soma + notasDoAluno;
            media = soma / numerosleitor;
        }
        System.out.println("Sua media final será: " + media);

    }
}
