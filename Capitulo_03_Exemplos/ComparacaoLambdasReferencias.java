// Exemplo 5: Comparação entre Lambdas e Referências
// Compara o uso de lambdas e referências a métodos para clareza de código.
import java.util.Arrays;
import java.util.List;

public class ComparacaoLambdasReferencias {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "joão", "maria");

        // Com lambda
        nomes.stream()
             .map(nome -> nome.toUpperCase())
             .forEach(nome -> System.out.println(nome));

        // Com referências a métodos
        nomes.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
