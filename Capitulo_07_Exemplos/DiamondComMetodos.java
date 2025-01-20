// Exemplo 4: Diamond com Métodos Genéricos
// Demonstra o uso de diamond em métodos que retornam objetos genéricos.
import java.util.HashSet;
import java.util.Set;

public class DiamondComMetodos {
    public static void main(String[] args) {
        Set<String> conjunto = criarConjunto();
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");

        System.out.println("Conjunto: " + conjunto);
    }

    // Método genérico para criar um conjunto
    public static <T> Set<T> criarConjunto() {
        return new HashSet<>();
    }
}
