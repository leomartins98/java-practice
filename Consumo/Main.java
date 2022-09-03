package Consumo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Aparelho> carrinho = new ArrayList<>();
        double totalCarrinho = 0;
        
        carrinho.add(new Televisao());
        carrinho.add(new Maquina());
        carrinho.add(new Televisao());
        carrinho.add(new Maquina());
        carrinho.add(new Televisao());
        carrinho.add(new Maquina());
        carrinho.add(new Aparelho(350, 35));
        carrinho.add(new Maquina(250, 85));
        carrinho.add(new Televisao(5200, "branca", 'C', 12, 75, true));
        carrinho.add(new Aparelho());
        for (Aparelho produto:carrinho) {
            System.out.println(produto.precoFinal());
            totalCarrinho += produto.precoFinal();
            
        }
        System.out.println(totalCarrinho);
    }
}
