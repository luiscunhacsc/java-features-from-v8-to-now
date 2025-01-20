// Exemplo 4: Classes Record - Java 16
public record Produto(String nome, double preco) {
    public String descricao() {
        return nome + " custa " + preco;
    }

    public static void main(String[] args) {
        var produto = new Produto("Notebook", 3000.0);
        System.out.println(produto.descricao());
    }
}
