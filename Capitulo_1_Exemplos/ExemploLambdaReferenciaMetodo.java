// Exemplo 5: Lambda com Referência a Métodos
// Substitui uma lambda por uma referência a método, melhorando a legibilidade.
import java.util.Arrays;
import java.util.List;

public class ExemploLambdaReferenciaMetodo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria");

        // Usando referência ao método println
        nomes.forEach(System.out::println);
    }
}
