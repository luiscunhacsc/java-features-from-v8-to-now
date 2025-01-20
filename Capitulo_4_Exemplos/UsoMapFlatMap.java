// Exemplo 3: Uso de map e flatMap
// Demonstra como transformar e evitar aninhamento de Optional.
import java.util.Optional;

public class UsoMapFlatMap {
    public static void main(String[] args) {
        Optional<String> nome = Optional.of("Java");

        // Transformar o valor contido no Optional
        Optional<Integer> tamanho = nome.map(String::length);
        System.out.println("Tamanho: " + tamanho.orElse(0)); // Saída: 4

        // Evitar aninhamento com flatMap
        Optional<Optional<String>> aninhado = Optional.of(Optional.of("Valor"));
        Optional<String> desaninhado = aninhado.flatMap(valor -> valor);
        System.out.println("Valor desaninhado: " + desaninhado.orElse("Sem valor")); // Saída: Valor
    }
}
