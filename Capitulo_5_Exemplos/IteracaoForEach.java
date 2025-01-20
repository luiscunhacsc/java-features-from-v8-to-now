// Exemplo 1: Iteração Melhorada com forEach
// Demonstra o uso do método forEach com Collections.
import java.util.Arrays;
import java.util.List;

public class IteracaoForEach {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria");

        // Iteração melhorada com forEach
        nomes.forEach(nome -> System.out.println("Nome: " + nome));
    }
}
