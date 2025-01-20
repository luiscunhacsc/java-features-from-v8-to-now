// Exemplo 2: Uso de try-with-resources com Scanner
// Mostra como usar o Scanner com try-with-resources para fechamento automático.
import java.util.Scanner;

public class TryWithResourcesScanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma mensagem: ");
            String mensagem = scanner.nextLine();

            System.out.println("Mensagem recebida: " + mensagem);
        } // O Scanner será fechado automaticamente aqui.
    }
}
