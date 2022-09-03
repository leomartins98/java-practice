public class Gerente extends Funcionario {

  public String nome_usu;
  public String senha;

  public Gerente(String nome, double salario, String nome_usu, String senha) {
    super(nome, salario);
    this.nome_usu = nome_usu;
    this.senha = senha;
  }

  public String getNome_usu() {
    return nome_usu;
  }

  public void setNome_usu(String nome_usu) {
    this.nome_usu = nome_usu;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  @Override
  public double bonificacao() {
    double total;
    total = (getSalario() * 0.25) + getSalario();
    return total;
  }

  @Override
  public void mostrarDados() {
    super.mostrarDados();
    System.out.println(getNome_usu());
    System.out.println(getSenha());
  }
}
