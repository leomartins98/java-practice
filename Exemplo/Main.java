public class Main {

  public static void main(String[] args) {
    int numeros[] = { 1, 2, 3 };

    System.out.println(numeros[0]);
    System.out.println(numeros[1]);
    System.out.println(numeros[2]);

    try {
      System.out.println(numeros[2]);
    } catch (Exception e) {
      System.out.println(e.getClass());
      System.out.println(e.getCause());
    }
    System.out.println("O programa terminou");
  }
}
