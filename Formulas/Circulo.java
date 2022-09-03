package Formulas;

public class Circulo extends Formas {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double total;
        total = Math.PI * Math.pow(raio, 2);
        return total;
    }

    @Override
    public double calcularPerimetro() {
        double total;
        total = 2*Math.PI*raio;
        return total;
    }

    
    
    
}
