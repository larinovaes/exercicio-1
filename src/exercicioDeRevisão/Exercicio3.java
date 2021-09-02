package exercicioDeRevisão;

import java.util.Scanner;
/**
 *  Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
 * número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
 * a tabuada. A saída deve ser conforme o exemplo abaixo:
 */
public class Exercicio3 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero que deja multiplicar: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " +(numero*i));
        }
    }
}
