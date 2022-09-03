package Supermercado;
import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    TipoPagamento tipoPgt;    
    double totalPedido = 0;
    ArrayList<Item> itens;
    int qtdVendaProdutos;

    public Pedido(Cliente cliente, TipoPagamento tipoPgt) {
        this.cliente = cliente;
        this.tipoPgt = tipoPgt;
        this.itens = new ArrayList<>();
        cliente.addNumPedidos();
        addPagamento(this.tipoPgt);
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoPagamento getTipoPgt() {
        return tipoPgt;
    }
    public void setTipoPgt(TipoPagamento tipoPgt) {
        this.tipoPgt = tipoPgt;
    }
    
    public double calcularTotalPedido (double preco, int qtd) {
        totalPedido = totalPedido + (preco*qtd);
        return totalPedido;
    }
    
    public void mostrarTotal () {
        System.out.printf("\ntotal do Pedido: R$ %.2f\n", totalPedido);
    }

    public void addItem (Item it){
        itens.add(it);
        calcularTotalPedido(it.getProd().getPreco(), it.qtd_itens);
    }

    public void mostrarPedido () {
        for (int i=0;i<itens.size();i++){
            System.out.println("\nProduto: "+itens.get(i).getProd().getCodProd()+" -- Quantidade: "+itens.get(i).qtd_itens+"");
        }
    }

    static int cartao=0;
    static int cheque=0;
    static int dinheiro = 0;
    public static void addPagamento (TipoPagamento tipo) {
        if (tipo.equals(TipoPagamento.CARTAO)){
            cartao +=1;
        }
        else if (tipo.equals(TipoPagamento.CHEQUE)){
            cheque+=1;
        }
        else {
            dinheiro+=1;
        }
    }

    public static void mostrarPagamento () {
        System.out.println("Pagamento por cartão: "+cartao);
        System.out.println("Pagamento por cheque: "+cheque);
        System.out.println("Pagamento por dinheiro: "+dinheiro);
    }

}
