package Supermercado;

public class Produto {
    private int codProd;
    private double preco;
    private int qtdEstoque;
    private int qtdVendasProduto;
    
    public Produto(int codProd, double preco, int qtdEstoque) {
        this.codProd = codProd;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.qtdVendasProduto = 0;

    }

    public int getCodProd() {
        return codProd;
    }
    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public void setQtdVendas (int qtdVendasProduto) {
        this.qtdVendasProduto = qtdVendasProduto;
    }
    public int getQtdVendas () {
        return this.qtdVendasProduto;
    }
    
}
