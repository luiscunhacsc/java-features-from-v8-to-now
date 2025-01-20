// Exemplo 2: Referência a um Método de Instância de um Objeto Específico
// Demonstra como usar referências a métodos de instância em um objeto específico.
import java.util.Arrays;
import java.util.List;

public class MetodoInstanciaEspecifico {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Referência", "Métodos");

        StringBuilder sb = new StringBuilder();
        // Referência ao método append do StringBuilder
        palavras.forEach(sb::append);
        System.out.println(sb.toString()); // Saída: JavaReferênciaMétodos
    }
}
