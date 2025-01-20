// Exemplo 2: Correspondência de Padrões para Switch - Java 17
public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Object valor = "Olá, Java 17!";

        switch (valor) {
            case String s -> System.out.println("String recebida: " + s);
            case Integer i -> System.out.println("Inteiro recebido: " + i);
            default -> System.out.println("Outro tipo: " + valor);
        }
    }
}
