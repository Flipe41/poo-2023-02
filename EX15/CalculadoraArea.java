class CalculadoraArea {
    public static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0;
        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}