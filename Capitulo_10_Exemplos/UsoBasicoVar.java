// Exemplo 1: Uso Básico do var
// Demonstra como var pode ser usado para inferir tipos em variáveis locais.
import java.util.ArrayList;
import java.util.List;

public class UsoBasicoVar {
    public static void main(String[] args) {
        // Antes do Java 10: Declaração explícita do tipo
        List<String> listaAntiga = new ArrayList<String>();

        // Com Java 10: Inferência do tipo com var
        var listaNova = new ArrayList<String>();

        listaNova.add("Java");
        listaNova.add("10");

        System.out.println("Lista: " + listaNova);
    }
}
