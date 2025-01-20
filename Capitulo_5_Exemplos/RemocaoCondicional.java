// Exemplo 2: Remoção Condicional com removeIf
// Demonstra como remover elementos com base em uma condição.
import java.util.ArrayList;
import java.util.List;

public class RemocaoCondicional {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        // Remover números pares
        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Números ímpares: " + numeros); // Saída: [1, 3, 5]
    }
}
