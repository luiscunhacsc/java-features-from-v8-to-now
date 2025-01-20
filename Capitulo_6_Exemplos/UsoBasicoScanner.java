// Exemplo 1: Uso Básico do Scanner
// Demonstra como ler dados do console usando Scanner.
import java.util.Scanner;

public class UsoBasicoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");

        scanner.close(); // Fechar o Scanner
    }
}
