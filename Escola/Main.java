package Escola;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Projeto stem = new Projeto("STEM");

        Aluno kirk = new Aluno("Kirk Sahdo", "000.000.012-07", "2115080036", stem);
        Aluno pedro = new Aluno("Pedro Henrique", "000.000.012-02", "2115080037", stem);
        Aluno eric = new Aluno("Eric Perin", "000.000.012-03", "2115080038", stem);
        

        Departamento est = new Departamento("EST", "Av. Darcy Vargas", 40, new Date());
        Departamento esa = new Departamento("ESA", "Av. Carvalho Leal", 40, new Date());


        Professor cuevas = new Professor("Luis Cuevas", "000.000.012-06", "21150", "Doutor", "(92)99999-9999", est, stem);
        Professor jose = new Professor("Jose", "000.000.012-01", "21151", "Doutor", "(92)99999-9999", esa, stem);

        

        cuevas.addAluno(kirk);
        cuevas.addAluno(pedro);

        est.addProfessores(cuevas);
        est.setCoordenador(cuevas);
        jose.addAluno(eric);

        cuevas.mostrarDadosAlunos();

        est.mostrarDadosDpto();
    }
}