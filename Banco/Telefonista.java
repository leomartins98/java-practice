public class Telefonista extends Funcionario {

  private int cod_est;

  public Telefonista(String nome, double salario, int cod_est) {
    super(nome, salario);
    this.cod_est = cod_est;
  }

  public int getCod_est() {
    return cod_est;
  }

  public void setCod_est(int cod_est) {
    this.cod_est = cod_est;
  }

  @Override
  public void mostrarDados() {
    super.mostrarDados();
    System.out.println(getCod_est());
  }
}
