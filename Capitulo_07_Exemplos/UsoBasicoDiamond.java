// Exemplo 1: Uso Básico do Operador Diamond
// Demonstra como o diamond reduz a verbosidade ao instanciar coleções genéricas.
import java.util.ArrayList;
import java.util.List;

public class UsoBasicoDiamond {
    public static void main(String[] args) {
        // Sem o operador diamond (Java 6 e anteriores)
        List<String> listaAntiga = new ArrayList<String>();

        // Com o operador diamond (Java 7+)
        List<String> listaNova = new ArrayList<>();

        listaNova.add("Java");
        listaNova.add("Diamond");

        System.out.println("Elementos na lista: " + listaNova);
    }
}
