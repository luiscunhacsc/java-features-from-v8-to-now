// Exemplo 3: Lambda com Bloco de Código
// Demonstra como usar um bloco de código em lambdas para cálculos mais complexos.
import java.util.function.Function;

public class ExemploLambdaBloco {
    public static void main(String[] args) {
        Function<Integer, Integer> calcularFatorial = n -> {
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        };
        System.out.println("Fatorial de 5: " + calcularFatorial.apply(5)); // Saída: 120
    }
}
