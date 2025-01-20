// Exemplo 1: Introdução à API de Streams
// Demonstra o uso básico de Streams para filtrar e transformar uma lista.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntroducaoStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Filtrar números pares e calcular o quadrado
        List<Integer> quadradosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números pares: " + quadradosPares); // Saída: [4, 16]
    }
}
