package Escritorio;
import java.util.ArrayList;

public class Departamento {
    String nome;
    ArrayList<Funcionario> func = new ArrayList<Funcionario>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Funcionario> getFunc() {
        return func;
    }

    public void setFunc(ArrayList<Funcionario> func) {
        this.func = func;
    }

    public Departamento(String nome, ArrayList<Funcionario> func) {
        this.nome = nome;
        this.func = func;
    }

    public void inserirFuncionario (Funcionario F) {
        func.add(F);
    }

    public void mostrarFuncionarios() {
        for (int i=0;i<func.size();i++){
            System.out.println(func.get(i));
        }
    }

    public void excluirFuncionarios(Funcionario F){
        func.remove(F);
    }
    
}
