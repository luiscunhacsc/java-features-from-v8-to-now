// Exemplo 4: Manipulação de Mapas com computeIfAbsent
// Mostra como usar computeIfAbsent para evitar verificações manuais.
import java.util.HashMap;
import java.util.Map;

public class ManipulacaoMapas {
    public static void main(String[] args) {
        Map<String, Integer> contagens = new HashMap<>();

        // Adicionar contagens apenas se a chave estiver ausente
        contagens.computeIfAbsent("Java", k -> 1);
        contagens.computeIfAbsent("Streams", k -> 1);
        contagens.computeIfAbsent("Java", k -> 2); // Não será atualizado

        System.out.println("Contagens: " + contagens); // Saída: {Java=1, Streams=1}
    }
}
