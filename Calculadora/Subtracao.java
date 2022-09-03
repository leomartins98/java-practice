package Calculadora;

public class Subtracao implements OperacaoMatematica{

    @Override
    public int calcular(int n1, int n2) {
        int total;
        total = n1-n2;
        return total;
    }
    
}
