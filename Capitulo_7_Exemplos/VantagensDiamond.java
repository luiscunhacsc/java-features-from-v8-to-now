// Exemplo 5: Vantagens do Diamond
// Mostra como o uso do diamond melhora a legibilidade e reduz a redundância no código.
import java.util.ArrayList;
import java.util.List;

public class VantagensDiamond {
    public static void main(String[] args) {
        // Sem o operador diamond
        List<Integer> listaSemDiamond = new ArrayList<Integer>();

        // Com o operador diamond
        List<Integer> listaComDiamond = new ArrayList<>();

        listaComDiamond.add(1);
        listaComDiamond.add(2);
        listaComDiamond.add(3);

        System.out.println("Lista sem diamond: " + listaSemDiamond);
        System.out.println("Lista com diamond: " + listaComDiamond);
    }
}
