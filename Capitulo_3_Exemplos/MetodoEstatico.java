// Exemplo 1: Referência a um Método Estático
// Demonstra o uso de referências a métodos estáticos com Streams.
import java.util.Arrays;
import java.util.List;

public class MetodoEstatico {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1, -2, 3, 4);

        // Referência ao método estático Math.abs
        numeros.stream()
               .map(Math::abs)
               .forEach(System.out::println); // Saída: 1, 2, 3, 4
    }
}
