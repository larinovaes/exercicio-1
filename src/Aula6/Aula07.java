package Aula6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula07 {
    public static void main(String[] args) {
        List <String> alunos = new ArrayList<>();

        alunos.add("larissa");
        alunos.add("Raline");
        alunos.add("Paulo");

        for (String aula : alunos){
            System.out.println(aula);
        }

        Map <String, String > contatos = new HashMap<String,  String>();

        contatos.put("09897658", "André");
        contatos.put("09897788", "André");

        for (String referencia : contatos.keySet()){
            System.out.println("chave:  " +referencia+ " valor: " +contatos.get(referencia));
        }
    }
}
