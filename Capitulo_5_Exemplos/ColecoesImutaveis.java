// Exemplo 6: Criação de Coleções Imutáveis
// Mostra como criar coleções imutáveis usando métodos de fábrica.
import java.util.List;
import java.util.Map;

public class ColecoesImutaveis {
    public static void main(String[] args) {
        // Criar uma lista imutável
        List<String> listaImutavel = List.of("A", "B", "C");
        System.out.println("Lista imutável: " + listaImutavel);

        // Criar um mapa imutável
        Map<String, Integer> mapaImutavel = Map.of("A", 1, "B", 2);
        System.out.println("Mapa imutável: " + mapaImutavel);

        // Tentar modificar gera UnsupportedOperationException
        try {
            listaImutavel.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: Não é possível modificar a lista imutável.");
        }
    }
}
