// Exemplo 6: Stream Paralelo
// Demonstra como usar Streams paralelos para processamento eficiente.
import java.util.Arrays;
import java.util.List;

public class StreamParalelo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Processar números em paralelo para calcular o dobro
        numeros.parallelStream()
               .map(n -> n * 2)
               .forEach(System.out::println);
        // A ordem de saída não é garantida devido ao processamento paralelo.
    }
}
