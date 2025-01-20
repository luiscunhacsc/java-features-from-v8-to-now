// Exemplo 2: Lambda com Parâmetros
// Mostra como criar lambdas que recebem múltiplos parâmetros.
import java.util.function.BiFunction;

public class ExemploLambdaParametros {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> somar = (a, b) -> a + b;
        System.out.println("Soma: " + somar.apply(3, 5)); // Saída: Soma: 8
    }
}
