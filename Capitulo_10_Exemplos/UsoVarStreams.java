// Exemplo 4: Uso de var em Streams
// Mostra como usar var para simplificar operações com Streams.
import java.util.List;

public class UsoVarStreams {
    public static void main(String[] args) {
        List<String> linguagens = List.of("Java", "Python", "C++", "JavaScript");

        linguagens.stream()
            .filter(linguagem -> linguagem.startsWith("J"))
            .forEach(System.out::println);
    }
}
