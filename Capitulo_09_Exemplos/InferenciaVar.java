// Exemplo 5: Inferência de Tipos com var - Java 10
import java.util.ArrayList;

public class InferenciaVar {
    public static void main(String[] args) {
        var lista = new ArrayList<String>(); // Inferência de tipo
        lista.add("Java");
        lista.add("21");

        for (var item : lista) {
            System.out.println(item);
        }
    }
}
