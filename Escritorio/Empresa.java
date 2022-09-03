/*crie uma classe que representa uma empresa, 
registrando seu nome, CNPJ e departamentos (considere um máximo de 
10 departamentos).*/


package Escritorio;
import java.util.ArrayList;
public class Empresa {
    String nome;
    String CNPJ;
    ArrayList<Departamento> depto = new ArrayList<Departamento>();
    public Empresa(String nome, String cNPJ, ArrayList<Departamento> depto) {
        this.nome = nome;
        CNPJ = cNPJ;
        this.depto = depto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public ArrayList<Departamento> getDepto() {
        return depto;
    }

    public void setDepto(ArrayList<Departamento> depto) {
        this.depto = depto;
    }

    public void inserirDepto (Departamento D) {
        depto.add(D);
    }

    public void mostrarDepto () {
        for (int i=0;i<depto.size();i++){
            System.out.println(depto.get(i));
        }
    }

    public void transfFuncionarios (Funcionario func, Departamento D1, Departamento D2) {
        D1.excluirFuncionarios(func);
        D2.inserirFuncionario(func);
        
    }

}
