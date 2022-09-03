package Formulas;

public class Retangulo extends Formas {
    private double lado;
    private double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Retangulo (double lado){
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double total;
        total = lado*altura;
        return total;
    }

    @Override
    public double calcularPerimetro() {
        double total;
        total = (lado*2)+(altura*2);
        return total;
    }

    
}
