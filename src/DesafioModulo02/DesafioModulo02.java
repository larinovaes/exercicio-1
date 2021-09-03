package DesafioModulo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Desafio-Modulo02
public class DesafioModulo02 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        System.out.println("--- Olá,vamos iniciar nosso cadastro! ---");
        //Pedindoao usuario para inserir seus dados para o cadastro
        System.out.println("Para cadastrar um funcionário digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("CPF: ");
        String cpf = leitor.nextLine();
        System.out.println("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("E-mail : ");
        String email = leitor.nextLine();

        //Retornando dados do funcionário na tela
        funcionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " e-mail: " + email);
        System.out.println(funcionarios);
        System.out.println("Processo finalizado com sucesso!");
    }
}