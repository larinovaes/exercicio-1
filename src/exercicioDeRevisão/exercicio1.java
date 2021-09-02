package exercicioDeRevisão;

import java.lang.ref.PhantomReference;
import java.util.Scanner;

/**
 * Faça um programa que pergunte o preço de três produtos e informe qual
 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato
 */
public class exercicio1 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        double maisBarato = 0;
        boolean primeiroProduto = true;

        while (contador <= 3) {
            System.out.println("Digite o valor do produto " + contador);
            double precoDoProduto = leitor.nextDouble();

            if(primeiroProduto){
                maisBarato = precoDoProduto;
                primeiroProduto = false;
            }
            else if(maisBarato > precoDoProduto){
                maisBarato = precoDoProduto;
            }

            contador += 1;
        }
        System.out.println("Valor do produto mais barato é: " + maisBarato);

    }
}
