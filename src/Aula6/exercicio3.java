package Aula6;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.

        Scanner leitor = new Scanner(System.in);

        int contador = 2;
        double maiorValor = 0;
        double menorValor = 0;
        double valorLido = 10;

        System.out.println("Escolha 10 números ");
        System.out.println("Insira o número 1 : ");
        double numerosDoCliente = leitor.nextDouble();
        maiorValor = numerosDoCliente;
        menorValor = numerosDoCliente;

        while (contador <= valorLido) {
            System.out.println("Insira o número " + contador + " :");
            numerosDoCliente = leitor.nextDouble();
            contador++;

            if (numerosDoCliente < menorValor) {
                menorValor = numerosDoCliente;
            }
            else if(numerosDoCliente > maiorValor){
                maiorValor=numerosDoCliente;
            }
        }
        System.out.println("Esse é o menor número: " +menorValor);
        System.out.println("Esse é o maior número: " +maiorValor);


    }
}
