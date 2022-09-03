package Consumo;

public class Televisao extends Aparelho {
    public double polegadas = 20;
    public boolean tdt = false;
    
    public Televisao () {
       super();
    }

    public Televisao (double precoBase, double peso) {
        super(precoBase, peso);
    }

    public Televisao (double precoBase, String cor, char consumoEnergia, double peso, double polegadas, boolean tdt){
        super(precoBase, cor, consumoEnergia, peso);
        this.polegadas = polegadas;
        this.tdt = tdt;
    }

    public double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(double polegadas) {
        this.polegadas = polegadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public double precoFinal () {
        double precoTotal = super.precoFinal();
        if (getPolegadas()>40&&isTdt()==true) {
            precoTotal = 500 + (0.30*super.precoFinal()) + super.precoFinal();
        }
        else if (getPolegadas()>40) {
            precoTotal = (0.30*super.precoFinal())+super.precoFinal();
        }
        else if (isTdt()==true) {
            precoTotal = 500 + super.precoFinal();
        }
        return precoTotal;
    }   
    
}
