// Exemplo 1: Métodos de Fábrica para Coleções Imutáveis (Java 9)
import java.util.List;
import java.util.Map;

public class MetodosFabricas {
    public static void main(String[] args) {
        // Criar uma lista imutável
        List<String> lista = List.of("A", "B", "C");
        System.out.println("Lista: " + lista);

        // Criar um mapa imutável
        Map<String, Integer> mapa = Map.of("A", 1, "B", 2, "C", 3);
        System.out.println("Mapa: " + mapa);

        // Tentar modificar gera UnsupportedOperationException
        try {
            lista.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: Não é possível modificar a lista imutável.");
        }
    }
}
