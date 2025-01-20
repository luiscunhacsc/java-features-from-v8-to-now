// Exemplo 4: Referência a um Construtor
// Mostra como criar objetos diretamente no pipeline de Streams.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Produto {
    String nome;

    Produto(String nome) {
        this.nome = nome;
    }
}

public class ReferenciaConstrutor {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Caneta", "Caderno", "Borracha");

        // Referência ao construtor Produto(String)
        List<Produto> produtos = nomes.stream()
                                      .map(Produto::new)
                                      .collect(Collectors.toList());

        produtos.forEach(produto -> System.out.println(produto.nome));
        // Saída: Caneta, Caderno, Borracha
    }
}
