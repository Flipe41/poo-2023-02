import java.util.ArrayList;
import java.util.List;

abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Quadrado extends Figura {
    protected double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

class Retangulo extends Quadrado {
    private double altura;

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado + altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

class Triangulo extends Figura {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

interface Desenho {
    String desenhar();
}

class DesenhoQuadrado implements Desenho {
    private double lado;

    public DesenhoQuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Quadrado";
    }
}

class DesenhoRetangulo implements Desenho {
    private double lado;
    private double altura;

    public DesenhoRetangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Retângulo";
    }
}

class DesenhoCirculo implements Desenho {
    private double raio;

    public DesenhoCirculo(double raio) {
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Círculo";
    }
}

class DesenhoTriangulo implements Desenho {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public DesenhoTriangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Triângulo";
    }
}

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(7, 3, 4, 5);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());

        List<Desenho> figuras = new ArrayList<>();
        figuras.add(new DesenhoQuadrado(5));
        figuras.add(new DesenhoRetangulo(4, 6));
        figuras.add(new DesenhoCirculo(3));
        figuras.add(new DesenhoTriangulo(7, 3, 4, 5));

        for (Desenho figura : figuras) {
            System.out.println(figura.desenhar());
        }
    }
}
