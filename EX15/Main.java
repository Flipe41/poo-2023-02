public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 8);

        FormaGeometrica[] formas = {circulo, retangulo, triangulo};

        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);
        System.out.println("A área total das formas é: " + areaTotal);
    }
}
