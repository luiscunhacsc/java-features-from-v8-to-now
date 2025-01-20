// Exemplo 5: Uso de orElseThrow
// Demonstra como lançar exceções para valores ausentes.
import java.util.Optional;

public class UsoOrElseThrow {
    public static void main(String[] args) {
        Optional<String> vazio = Optional.ofNullable(null);

        try {
            // Lançar exceção se o valor estiver ausente
            String valor = vazio.orElseThrow(() -> new IllegalArgumentException("Valor ausente!"));
            System.out.println("Valor: " + valor);
        } catch (Exception e) {
            System.err.println("Exceção: " + e.getMessage()); // Saída: Valor ausente!
        }
    }
}
