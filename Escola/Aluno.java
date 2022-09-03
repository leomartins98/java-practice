package Escola;

import java.util.ArrayList;
import java.util.Arrays;

public class Aluno {
    private String nome;
    private String cpf;
    private String matricula;
    private Endereco endereco;
    private ArrayList<Projeto> projetos;

    public Aluno(String nome, String cpf, String matricula, Projeto ...projetos) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.endereco = new Endereco();
        this.projetos = new ArrayList<>(Arrays.asList(projetos));
    }

    public void mostrarDadosAluno() {
        String alunoData = "Aluno -> " + this.nome + ":\n" +
                "\tMatricula: " + this.matricula +
                "\n\tCPF: " + this.cpf;
        System.out.println(alunoData);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public void addProjetos(Projeto ...projetos) {
        for (Projeto projeto : projetos) {
            if (!this.projetos.contains(projeto)) {
                this.projetos.add(projeto);
            }
        }
    }

    public void removeProjetos(Projeto ...projetos) {
        for (Projeto projeto : projetos) {
            if (this.projetos.contains(projeto)) {
                this.projetos.remove(projeto);
            }
        }
    }
}
