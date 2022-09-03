package Escritorio;

import java.util.Date;

public class Funcionario {

  String nome;
  double salario;
  Date data_admissao;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Date getData_admissao() {
    return data_admissao;
  }

  public void setData_admissao(Date data_admissao) {
    this.data_admissao = data_admissao;
  }

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void mostrarDados() {
    System.out.println("--------");
    System.out.println(this.nome);
    System.out.println(this.salario);
  }

  public double AjusteSalario(double ajuste) {
    double novoSalario = ajuste + salario;
    return novoSalario;
  }
}
