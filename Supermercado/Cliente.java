package Supermercado;

public class Cliente {
    
    String nome;
    String cpf;
    int numPedidos = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getNumPedidos() {
        return numPedidos;
    }
    public void addNumPedidos() {
        this.numPedidos = numPedidos+1;
    }
    
    public void mostrarNumPedidos () {
        System.out.println("Cliente: "+nome+" -- Num Pedidos: "+numPedidos);
    }

}
