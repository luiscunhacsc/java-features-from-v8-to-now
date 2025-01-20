// Exemplo 2: Limitações do var
// Mostra onde o uso de var não é permitido.
public class LimitacoesVar {
    public static void main(String[] args) {
        // var não pode ser usado para variáveis não inicializadas
        // var valor; // ERRO: é necessário inicializar a variável

        // var não pode ser usado como tipo de retorno
        // public var metodoInvalido() { return 1; } // ERRO

        // var não pode ser usado em parâmetros de métodos
        // public void metodoComVar(var parametro) {} // ERRO
    }
}
