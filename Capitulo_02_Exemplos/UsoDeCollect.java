// Exemplo 5: Uso de collect para Criar Coleções
// Demonstra como coletar resultados em diferentes coleções.
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UsoDeCollect {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Ana");

        // Criar um conjunto de nomes únicos
        Set<String> nomesUnicos = nomes.stream()
                .collect(Collectors.toSet());

        System.out.println("Nomes únicos: " + nomesUnicos); // Saída: [Ana, João, Maria]
    }
}
