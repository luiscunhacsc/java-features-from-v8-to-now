// Exemplo 1: Classes Seladas (Sealed Classes) - Java 17
sealed interface Forma permits Circulo, Retangulo {
    double calcularArea();
}

final class Circulo implements Forma {
    private final double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

final class Retangulo implements Forma {
    private final double largura;
    private final double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

public class UsoSealed {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4, 6);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
