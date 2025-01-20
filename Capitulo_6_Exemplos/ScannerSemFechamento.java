// Exemplo 4: Scanner sem Fechamento Explicito (Avisos de Warning)
// Demonstra o aviso ao não fechar o Scanner explicitamente em alguns contextos.
import java.util.Scanner;

public class ScannerSemFechamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String entrada = scanner.nextLine();

        System.out.println("Você digitou: " + entrada);
        // Scanner não fechado explicitamente - Aviso de recurso não fechado pode ocorrer.
    }
}
