// Exemplo 1: Uso Básico de Expressões Lambda
// Demonstra como usar uma expressão lambda para substituir uma classe anônima.
public class ExemploLambdaBasico {
    public static void main(String[] args) {
        Runnable tarefa = () -> System.out.println("Tarefa em execução com lambda!");
        tarefa.run();
    }
    
    // Nota: Prefira lambdas para implementar interfaces funcionais simples, evitando o uso de classes anônimas.
    // Fonte: Effective Java, Item 42 - Prefer Lambdas to Anonymous Classes.
}
