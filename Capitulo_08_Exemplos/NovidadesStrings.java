// Exemplo 3: Novas Funcionalidades de Strings (Java 11)
public class NovidadesStrings {
    public static void main(String[] args) {
        String texto = "\n\nJava 11\n\n";

        // Métodos isBlank e strip
        System.out.println("Está vazio? " + texto.isBlank()); // true
        System.out.println("Texto sem espaços: " + texto.strip());

        // lines para dividir o texto em linhas
        texto.lines().forEach(System.out::println);
    }
}
