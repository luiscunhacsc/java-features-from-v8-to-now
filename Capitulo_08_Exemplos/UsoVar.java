// Exemplo 2: Uso de var para Inferência de Tipos (Java 10)
import java.util.ArrayList;

public class UsoVar {
    public static void main(String[] args) {
        var lista = new ArrayList<String>(); // Inferência de tipo
        lista.add("Java");
        lista.add("10");

        for (var item : lista) {
            System.out.println(item);
        }
    }
}
