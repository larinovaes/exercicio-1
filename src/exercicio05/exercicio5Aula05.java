package exercicio05;

import java.util.Scanner;

public class exercicio5Aula05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

         int contador = 1;
         double qtdDeRepeticao = 5;
         double quantidadeDePares = 0;

        System.out.println("Digite a quantidade de numeros que deseja: ");
        double numerosPares = leitor.nextDouble();

        while (contador <= numerosPares){
            System.out.println("Digite o numero " +contador+ ":" );
            double valoresDeNumeros = leitor.nextDouble();

            if ( valoresDeNumeros  %  2 == 0 ){
                quantidadeDePares += 1;
            }
            contador ++;
        }
        System.out.println("A quantidade de números pares é igual a: " +quantidadeDePares);
    }
}
