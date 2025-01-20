// Exemplo 3: Melhorias no Diamond com Java 9+
// Demonstra como o operador diamond foi aprimorado para funcionar em situações mais complexas.
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelhoriasDiamond {
    public static void main(String[] args) {
        // Diamond com classes aninhadas (Java 9+)
        Map<String, List<String>> mapa = new HashMap<>();

        mapa.put("Linguagens", List.of("Java", "Python", "C++"));

        System.out.println("Mapa: " + mapa);
    }
}
