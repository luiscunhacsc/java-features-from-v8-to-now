// Exemplo 2: Operações Intermediárias
// Mostra como usar operações como distinct, sorted e map.
import java.util.Arrays;
import java.util.List;

public class OperacoesIntermediarias {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Pedro", "Ana", "Maria");

        // Remover duplicados, converter para maiúsculas e ordenar
        nomes.stream()
             .distinct()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
        // Saída: ANA, JOÃO, MARIA, PEDRO
    }
}
