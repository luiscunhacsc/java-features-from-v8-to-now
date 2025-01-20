// Exemplo 5: Integração com Streams
// Demonstra como combinar coleções com Streams.
import java.util.Arrays;
import java.util.List;

public class IntegracaoStreams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Filtrar e calcular o quadrado dos números pares
        List<Integer> quadradosPares = numeros.stream()
                                              .filter(n -> n % 2 == 0)
                                              .map(n -> n * n)
                                              .toList();

        System.out.println("Quadrados dos números pares: " + quadradosPares); // Saída: [4, 16]
    }
}
