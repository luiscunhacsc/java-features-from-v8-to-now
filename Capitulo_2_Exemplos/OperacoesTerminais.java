// Exemplo 3: Operações Terminais
// Demonstra o uso de operações terminais como count e forEach.
import java.util.Arrays;
import java.util.List;

public class OperacoesTerminais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Contar números pares
        long countPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Quantidade de números pares: " + countPares); // Saída: 2
    }
}
