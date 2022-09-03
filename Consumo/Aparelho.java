package Consumo;

public class Aparelho {
    public double precoBase = 1000;
    public String cor = "branca";
    public char consumoEnergia = 'F';
    public double peso = 5;
    public double precoTotal;
    
    public Aparelho() {
    }

    public Aparelho (double precoBase, double peso) {
        this.precoBase = precoBase;
        this.peso = peso;
    }

    public Aparelho(double precoBase, String cor, char consumoEnergia, double peso) {
        this.precoBase = precoBase;
        this.cor = cor;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }

    public double getPrecoBase() {
        return precoBase;
    }
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public char getConsumoEnergia() {
        return consumoEnergia;
    }
    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double verifiqueConsumoEnergia (char consumoEnergia) {
        double precoConsumo;
        if (consumoEnergia=='A') {
            precoConsumo = 1000;
        }
        else if (consumoEnergia=='B') {
            precoConsumo = 800;
        }
        else if (consumoEnergia=='C') {
            precoConsumo = 600;
        }
        else if (consumoEnergia=='D') {
            precoConsumo = 500;
        }
        else if (consumoEnergia=='E') {
            precoConsumo = 300;
        }
        else if (consumoEnergia=='F') {
            precoConsumo = 100;
        }
        else {
            precoConsumo = 100;
        }
        return precoConsumo;
    }

    public String verificaCor (String cor) {
        if (cor=="branca"||cor=="preta"||cor=="vermelho"||cor=="azul"||cor=="cinza"){
            return cor;
        }
        else {
        return cor = "branca";
        }
    }
    public double precoPeso (double peso) {
        double preco=0;
        if (peso>=0&&peso<=19){
            preco = 100;
        }
        else if (peso>=20&&peso<=49){
            preco = 500;
        }
        else if (peso>=50&&peso<=79){
            preco = 800;
        }
        else if (peso>80){
            preco = 1000;
        }
        return preco;
    }

    public double precoFinal (){
        precoTotal = 0;
        precoTotal = verifiqueConsumoEnergia(consumoEnergia) + precoPeso(peso) + precoBase;
        return precoTotal;
    }

}
    

