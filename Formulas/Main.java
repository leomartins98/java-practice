package Formulas;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<Formas> area = new ArrayList<>();
            area.add(new Retangulo(4, 5));
            area.add(new Retangulo(3, 6));
            area.add(new Circulo(4));
            area.add(new Circulo(2));
            area.add(new Quadrado(3));
        
        for(Formas result:area) {
            System.out.println("Area: "+result.calcularArea()+" -- Perimetro: "+result.calcularPerimetro());
        }
    }
}
