package Supermercado;
import java.util.ArrayList;

public class Main {

    public void mostrarProdmaisVendido (){
        
    }
    public static void main(String[] args) {
        ArrayList<Produto> prods = new ArrayList<>();

        Cliente Leo = new Cliente ("Leonardo", "001.903.204");
        Cliente Canelinha = new Cliente("Canelinha", "034.595.702-72");
        Produto sabonete = new Produto (1, 2.5f, 15);
        Produto maca = new Produto (4, 2.9f, 20);
        Produto lapis = new Produto(15, 1.5f, 30);
        Produto carne = new Produto(2, 55.9f, 15);

        prods.add(sabonete);
        prods.add(lapis);
        prods.add(maca);
        prods.add(carne);

        Pedido p1 = new Pedido (Leo, TipoPagamento.CARTAO);
        Pedido p2 = new Pedido (Canelinha, TipoPagamento.DINHEIRO);

        Item it1 = new Item(sabonete, 3);
        Item it2 = new Item(maca, 4);
        Item it3 = new Item(carne, 1);
        Item it4 = new Item(lapis, 2);

        p1.addItem(it1);
        p1.addItem(it2);
        p2.addItem(it3);
        p2.addItem(it4);

        p1.mostrarPedido();
        p1.mostrarTotal();
        Leo.mostrarNumPedidos();
        

        p2.mostrarPedido();
        p2.mostrarTotal();
        Canelinha.mostrarNumPedidos();

        int max=-99999;
        Produto prod = null;

for(Produto product: prods){
  if(product.getQtdVendas()>max){
      prod = product;
      max =  product.getQtdVendas();
  }
}

System.out.println(prod.getCodProd());
    Pedido.mostrarPagamento();

    }

}