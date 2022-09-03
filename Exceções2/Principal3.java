public class Principal3 {

  public static void main(String[] args) {
    System.out.println("Início principal");
    try {
      funcao1();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exceção encontrada: " + e.getClass().getName());
    }
    System.out.println("Fim principal");
  }

  public static void funcao1() throws ArrayIndexOutOfBoundsException {
    System.out.println("Inicio função 1");
    funcao2();
    System.out.println("Fim função 1");
  }

  public static void funcao2() throws ArrayIndexOutOfBoundsException {
    System.out.println("Inicio função 2");
    int[] lista = new int[10];
    for (int i = 0; i <= 15; i++) {
      lista[i] = i;
      System.out.println(i);
    }
    System.out.println("Fim função 2");
  }
}
