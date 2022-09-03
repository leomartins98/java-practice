public class Secretaria extends Funcionario {

  private int num_ramal;

  public Secretaria(int num_ramal, String nome, double salario) {
    super(nome, salario);
    this.num_ramal = num_ramal;
  }

  public int getNum_ramal() {
    return num_ramal;
  }

  public void setNum_ramal(int num_ramal) {
    this.num_ramal = num_ramal;
  }

  @Override
  public void mostrarDados() {
    super.mostrarDados();
    System.out.println(getNum_ramal());
  }
}
