// Exemplo 7: API de Funções Estrangeiras e Memória - Java 21
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;

public class ForeignFunctionAPI {
    public static void main(String[] args) {
        try (var segmento = MemorySegment.allocateNative(100)) {
            segmento.setUtf8String(0, "Olá, memória nativa!");
            String texto = segmento.getUtf8String(0);
            System.out.println(texto);
        }
    }
}
