public class Funcionario {

  public String nome;
  public double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

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

  public double bonificacao() {
    double total;
    total = (getSalario() * 0.10) + getSalario();
    return total;
  }

  public void mostrarDados() {
    System.out.println(getNome());
    System.out.println(getSalario());
  }
}
