package Aula6;

//if(numero % 2 == 0){par} else {impar}

import java.util.Scanner;

public class TreinamentoDeNumerosParEimpa {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numerosImpares = 0;
        int numeroPar = 0;

        System.out.println("Digite um numero e veja se ele é impar ou par");
        int todosOsNumeros = leitor.nextInt();
        if (todosOsNumeros  % 2 == 0){
            numeroPar++;
            System.out.println("Esse numero é par " +numeroPar);
        } else  {
            numerosImpares++;
            System.out.println("Esse numero é impar " +numerosImpares);
        }
    }
}
