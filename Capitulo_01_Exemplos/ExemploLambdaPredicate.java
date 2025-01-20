// Exemplo 4: Uso de Lambda com Predicate
// Aplica uma lambda para filtrar elementos de uma lista.
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploLambdaPredicate {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> isPar = n -> n % 2 == 0;

        System.out.println("Números pares:");
        numeros.stream()
               .filter(isPar)
               .forEach(System.out::println); // Saída: 2, 4
    }
}
