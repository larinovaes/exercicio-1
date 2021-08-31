package br.com.zup.aula5;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        int contador = 1;
        double resultado = 0;
        double numeros = 5;
        Scanner leitor = new Scanner(System.in);

        while (contador <= numeros){
            System.out.println("Digite seu numero: " +contador);
            numeros = leitor.nextDouble();
            resultado = resultado + numeros;

            contador++;
        }

        System.out.println("Resultado da soma será: " +resultado );
    }
}
