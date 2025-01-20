// Exemplo 3: Referência a um Método de Instância de um Objeto Arbitrário
// Usa referências a métodos de instância em objetos arbitrários de um tipo específico.
import java.util.Arrays;
import java.util.List;

public class MetodoInstanciaArbitrario {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "joão", "maria");

        // Referência ao método toUpperCase da classe String
        nomes.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println); // Saída: ANA, JOÃO, MARIA
    }
}
