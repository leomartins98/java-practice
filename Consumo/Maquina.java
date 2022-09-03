package Consumo;

public class Maquina extends Aparelho{
    public int capacidade = 5;
    
    public Maquina () {
        super();
    }

    public Maquina (double precoBase, double peso) {
        super(precoBase, peso);
    } 

    public Maquina (double precoBase, String cor, char consumoEnergia, double peso, int capacidade) {
        super(precoBase, cor, consumoEnergia, peso);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public double precoFinal () {
        double precoTotal = super.precoFinal();
        if (getCapacidade()>30) {
            precoTotal = 500 + super.precoFinal();
        }
        else {
            precoTotal = super.precoFinal();
        }
        return precoTotal;
    }
    
}
