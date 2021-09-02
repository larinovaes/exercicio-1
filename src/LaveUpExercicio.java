import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//laveUp
public class LaveUpExercicio {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map <String, String> alunos = new HashMap<String, String>();

        System.out.println("--- Seja Bem Vindo ---");
        System.out.println("Digite o nome completo do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o seu telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("Digite o seu e-mail");
        String email = leitor.nextLine();

        alunos.put(email, " Nome: " + nome + " Telefone: " + telefone);
        System.out.println(alunos);

    }
}
