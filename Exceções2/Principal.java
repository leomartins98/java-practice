public class Principal {

  public static void main(String[] args) {
    System.out.println("Início principal");
    funcao1();
    System.out.println("Fim principal");
  }

  public static void funcao1() {
    System.out.println("Inicio função 1");
    funcao2();
    System.out.println("Fim função 1");
  }

  public static void funcao2() {
    System.out.println("Inicio função 2");
    int[] lista = new int[10];

    for (int i = 0; i <= 15; i++) {
      try {
        lista[i] = i;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Erro de Exceção: " + e.getMessage());
        System.out.println("Exceção: " + e.getClass().getName());
      }
      System.out.println(i);
    }

    System.out.println("Fim função 2");
  }
}
