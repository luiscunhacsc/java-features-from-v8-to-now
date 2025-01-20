// Exemplo 2: Restrições do Operador Diamond
// Mostra como o operador diamond não pode ser usado em algumas situações.
import java.util.ArrayList;
import java.util.List;

public class RestricoesDiamond {
    public static void main(String[] args) {
        // Diamond não pode ser usado com classes anônimas
        List<String> listaAnonima = new ArrayList<String>() {
            {
                add("Não permitido com diamond");
            }
        };

        System.out.println("Elementos: " + listaAnonima);
    }
}
