package Supermercado;

public class Item {
    Produto prod;
    int qtd_itens;
    
    public Item(Produto prod, int qtd_itens) {
        this.prod = prod;
        this.qtd_itens = qtd_itens;
        this.prod.setQtdVendas(qtd_itens+this.prod.getQtdVendas());
    }

    public int getQtd_itens() {
        return qtd_itens;
    }

    public void setQtd_itens(int qtd_itens) {
        this.qtd_itens = qtd_itens;
    }

    public Produto getProd() {
        return prod;
    }


    public void setProd(Produto prod) {
        this.prod = prod;
    }
    
    
}
