// Exemplo 4: Operação reduce
// Mostra como somar elementos de uma lista usando reduce.
import java.util.Arrays;
import java.util.List;

public class OperacaoReduce {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Soma de todos os números
        int soma = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("Soma dos números: " + soma); // Saída: 15
    }
}
