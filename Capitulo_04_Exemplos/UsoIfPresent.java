// Exemplo 4: Uso de ifPresent e ifPresentOrElse
// Mostra como executar ações condicionais com Optional.
import java.util.Optional;

public class UsoIfPresent {
    public static void main(String[] args) {
        Optional<String> presente = Optional.of("Valor presente");

        // Executar uma ação se o valor estiver presente
        presente.ifPresent(valor -> System.out.println("Valor encontrado: " + valor)); // Saída: Valor encontrado

        // Executar ações condicionais (Java 9+)
        Optional<String> vazio = Optional.ofNullable(null);
        vazio.ifPresentOrElse(
            valor -> System.out.println("Valor encontrado: " + valor),
            () -> System.out.println("Valor ausente") // Saída: Valor ausente
        );
    }
}
