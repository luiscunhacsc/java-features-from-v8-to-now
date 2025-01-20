// Exemplo 3: Transformação com replaceAll
// Demonstra como transformar elementos de uma lista com replaceAll.
import java.util.ArrayList;
import java.util.List;

public class TransformacaoReplaceAll {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("java", "stream", "lambda"));

        // Converter todas as palavras para maiúsculas
        palavras.replaceAll(String::toUpperCase);
        System.out.println("Palavras transformadas: " + palavras); // Saída: [JAVA, STREAM, LAMBDA]
    }
}
