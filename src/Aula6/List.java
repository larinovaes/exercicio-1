package Aula6;


import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        java.util.List<Integer> todosOsNumeros = new ArrayList<>();
        java.util.List<Integer> numerosImpares = new ArrayList<>();
        java.util.List<Integer> numerosPares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(10);

        for (Integer referencia : todosOsNumeros) {

            if (referencia % 2 == 0) {
                numerosPares.add(referencia);
            } else {
                numerosImpares.add(referencia);
            }
        }
        System.out.println("Todos os numeros: " +todosOsNumeros);
        System.out.println("numeros pares: " +numerosPares);
        System.out.println("Quantidade de numeros pares: ");
        System.out.println(numerosPares.size());
        System.out.println("Numeros impares: " +numerosImpares);
        System.out.println("quantidade de numeros impares: ");
        System.out.println(numerosImpares.size());

    }
}
