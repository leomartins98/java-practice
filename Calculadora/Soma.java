package Calculadora;

public class Soma implements OperacaoMatematica {

    @Override
    public int calcular(int n1, int n2) {
        int total;
        total = n1+n2;
        return total;
    }
    
}
