package exercicioDeRevisão;
//Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class Exercicio5 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double maiorValor = 0;

        System.out.println("Escolha 5 numeros para saber qual é o maior");

        while (contador <= 5){
            System.out.println("Digite o "+contador+ " :");
            double numeroDoUsuario = leitor.nextDouble();
            contador++;

            if (numeroDoUsuario > maiorValor){
                maiorValor = numeroDoUsuario;
            }
        }
        System.out.println("Maior valor é igual a " +maiorValor);
    }
}
