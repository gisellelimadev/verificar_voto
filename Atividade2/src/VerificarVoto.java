import java.util.Scanner;
import java.util.Calendar;

public class VerificarVoto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você está apto(a) a votar!");
        } else {
            System.out.println("Você não está apto(a) a votar. A idade mínima é 16 anos.");
        }
    }
}
