package Escola;

import java.util.ArrayList;
import java.util.Arrays;

public class Professor {
    private String nome;
    private String cpf;
    private String matricula;
    private String titulo;
    private String fone;
    private ArrayList<Aluno> alunos;
    private ArrayList<Projeto> projetos;
    private Departamento departamento;
    private Endereco endereco;
    private Professor coordenador;
    private ArrayList<Professor> coordenandos;


    public Professor(String nome, String cpf, String matricula, String titulo, String fone, Projeto ...projetos) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.titulo = titulo;
        this.fone = fone;
        this.alunos = new ArrayList<>();
        this.endereco = new Endereco();
        this.projetos = new ArrayList<>(Arrays.asList(projetos));
    }

    public Professor(String nome, String cpf, String matricula, String titulo, String fone, Departamento departamento, Projeto ...projetos) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.titulo = titulo;
        this.fone = fone;
        this.alunos = new ArrayList<>();
        this.departamento = departamento;
        this.endereco = new Endereco();
        this.projetos = new ArrayList<>(Arrays.asList(projetos));
    }

    public void mostrarDadosProf(){
        String profData = "Professor " + this.nome + "\n" +
                "\tMatricula: " + this.matricula +
                "\n\tTelefone: " + this.fone +
                "\n\tCPF: " + this.cpf +
                "\n\tTitulo: " + this.titulo;
        System.out.println(profData);
    }

    public void mostrarDadosAlunos() {
        if (this.alunos.size() == 0) {
            System.out.println("Este professor não atende nenhum aluno!");
            return;
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Estes são os dados dos alunos que o professor " + this.nome + " atende: ");
        this.alunos.forEach((aluno) -> aluno.mostrarDadosAluno());
        System.out.println("------------------------------------------------------------------------------");
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
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

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Professor> getCoordenandos() {
        return coordenandos;
    }

    public void setCoordenandos(ArrayList<Professor> coordenandos) {
        this.coordenandos = coordenandos;
    }

    public void addCoordenandos(Professor ...professores) {
        for (Professor professor : professores) {
            if (!this.coordenandos.contains(professor)) {
                this.coordenandos.add(professor);
            }
        }
    }

    public void removeCoordenandos(Professor ...professores) {
        for (Professor professor : professores) {
            if (!this.coordenandos.contains(professor)) {
                this.coordenandos.remove(professor);
            }
        }
    }




}
