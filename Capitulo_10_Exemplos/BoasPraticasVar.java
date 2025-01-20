// Exemplo 3: Boas Práticas com var
// Demonstra boas práticas ao usar var para manter a legibilidade.
import java.util.HashMap;
import java.util.Map;

public class BoasPraticasVar {
    public static void main(String[] args) {
        // Evite usar var quando o tipo não for óbvio
        var mapa = new HashMap<String, Integer>();

        mapa.put("Java", 10);
        mapa.put("Python", 9);

        // Iterar no mapa com inferência de tipos
        for (var entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
