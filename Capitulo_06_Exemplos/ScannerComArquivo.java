// Exemplo 3: Scanner e Arquivos
// Demonstra como usar o Scanner para ler dados de um arquivo.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerComArquivo {
    public static void main(String[] args) {
        File arquivo = new File("exemplo.txt");

        try (Scanner scanner = new Scanner(arquivo)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}
