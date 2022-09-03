public class Main {

  public static void main(String[] args) {
    Funcionario Ian = new Gerente("Ian", 6000, "ian", "carlaamor");
    Funcionario Carla = new Telefonista("Carla", 3500, 3567);
    System.out.println(Ian.bonificacao());
    System.out.println(Carla.bonificacao());
    Carla.mostrarDados();
  }
}