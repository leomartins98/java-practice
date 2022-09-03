package Escola;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Departamento {

    private String nomeDpto;
    private String localDep;
    private int quantidadeProfessores;
    private Date dataCriacaoDpto;
    private Professor coordenador;
    private ArrayList<Professor> professores;

    public Departamento(String nomeDpto, String localDep, int quantidadeProfessores, Date dataCriacaoDpto) {
        this.nomeDpto = nomeDpto;
        this.localDep = localDep;
        this.quantidadeProfessores = quantidadeProfessores;
        this.dataCriacaoDpto = dataCriacaoDpto;
        this.professores = new ArrayList<>();
    }
    
    public Departamento(String nomeDpto, String localDep, int quantidadeProfessores, Date dataCriacaoDpto, Professor coordenador) {
        this.nomeDpto = nomeDpto;
        this.localDep = localDep;
        this.quantidadeProfessores = quantidadeProfessores;
        this.dataCriacaoDpto = dataCriacaoDpto;
        this.coordenador = coordenador;
        this.professores = new ArrayList<>();
    }

    public void mostrarDadosDpto() {
        String dateFormatted = new SimpleDateFormat("dd/MM/yyyy").format(this.dataCriacaoDpto);
        String depData = "Departamento -> " + this.nomeDpto + ":\n" +
                "\tLocal: " + this.localDep +
                "\n\tQuantidade de Professores: " + this.quantidadeProfessores +
                "\n\tData de Criação: " + dateFormatted +
                (this.coordenador != null ? "\n\tCoodernador: " + this.coordenador.getNome() : "") +
                (this.professores.size() > 0 ? "\n\tProfessores: " + this.professores : "");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(depData);
        System.out.println("------------------------------------------------------------------------------");
    }

    public String getNomeDpto() {
        return this.nomeDpto;
    }

    public void setNomeDpto(String nomeDpto) {
        this.nomeDpto = nomeDpto;
    }

    public String getLocalDep() {
        return this.localDep;
    }

    public void setLocalDep(String localDep) {
        this.localDep = localDep;
    }

    public int getQuantidadeProfessores() {
        return this.quantidadeProfessores;
    }

    public void setQuantidadeProfessores(int quantidadeProfessores) {
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public Date getDataCriacaoDpto() {
        return this.dataCriacaoDpto;
    }

    public void setDataCriacaoDpto(Date dataCriacaoDpto) {
        this.dataCriacaoDpto = dataCriacaoDpto;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if (!this.professores.contains(coordenador)) {
            this.professores.add(coordenador);
        }
        this.coordenador = coordenador;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void addProfessores(Professor ...professores) {
        for (Professor professor : professores) {
            if (!this.professores.contains(professor)) {
                this.professores.add(professor);
            }
        };
    }

    public void removeProfessores(Professor ...professores) {
        for (Professor professor : professores) {
            if (this.professores.contains(professor)) {
                this.professores.remove(professor);
            }
        }
    }

    
}
