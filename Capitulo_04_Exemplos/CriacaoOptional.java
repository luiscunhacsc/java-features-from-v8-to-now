// Exemplo 1: Criação de um Optional
// Demonstra como criar instâncias de Optional de forma segura.
import java.util.Optional;

public class CriacaoOptional {
    public static void main(String[] args) {
        // Criar um Optional com valor presente
        Optional<String> presente = Optional.of("Valor presente");
        System.out.println("Valor: " + presente.get()); // Saída: Valor presente

        // Criar um Optional que pode estar vazio
        Optional<String> vazio = Optional.ofNullable(null);
        System.out.println("Está vazio? " + vazio.isEmpty()); // Saída: true

        // Criar um Optional vazio
        Optional<String> somenteVazio = Optional.empty();
        System.out.println("Somente vazio: " + somenteVazio.isPresent()); // Saída: false
    }
}
