package Formulas;

public class Quadrado extends Retangulo {
    
    public Quadrado(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        double total;
        total = super.getLado() * super.getLado();
        return total;
    }

    @Override
    public double calcularPerimetro() {
        double total;
        total = super.getLado()*4;
        return total;
    }
}
