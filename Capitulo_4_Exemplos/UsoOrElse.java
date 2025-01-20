// Exemplo 2: Uso de orElse e orElseGet
// Mostra como fornecer valores padrão ou gerados dinamicamente para um Optional vazio.
import java.util.Optional;

public class UsoOrElse {
    public static void main(String[] args) {
        Optional<String> vazio = Optional.ofNullable(null);

        // Fornecer um valor padrão
        String valorPadrao = vazio.orElse("Valor padrão");
        System.out.println("Valor: " + valorPadrao); // Saída: Valor padrão

        // Fornecer um valor gerado dinamicamente
        String valorGerado = vazio.orElseGet(() -> "Valor gerado dinamicamente");
        System.out.println("Valor: " + valorGerado); // Saída: Valor gerado dinamicamente
    }
}
