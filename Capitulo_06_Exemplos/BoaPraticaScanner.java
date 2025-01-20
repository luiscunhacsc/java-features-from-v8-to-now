// Exemplo 5: Boa Prática com Fechamento de Scanner
// Usa try-with-resources para garantir fechamento, mesmo em caso de exceção.
import java.util.Scanner;

public class BoaPraticaScanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite sua cidade: ");
            String cidade = scanner.nextLine();

            System.out.println("Cidade informada: " + cidade);
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        } // Scanner fechado automaticamente
    }
}
