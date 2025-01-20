// Exemplo 5: Vantagens do var
// Compara o uso de var com declarações explícitas.
public class ComparacaoVar {
    public static void main(String[] args) {
        // Declaração explícita
        int numero = 10;
        String texto = "Exemplo";

        // Com var
        var numeroInferido = 10;
        var textoInferido = "Exemplo";

        System.out.println("Número: " + numeroInferido);
        System.out.println("Texto: " + textoInferido);
    }
}
