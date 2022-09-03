import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    teste1();
  }

  public static void teste1() {
    int x = 0, y = 0;
    boolean inputErrado = true;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Sei dividir");
    System.out.println("Primeiro numero inteiro: ");
    while (inputErrado) {
      try {
        String trans = teclado.nextLine();
        x = Integer.parseInt(trans);
        inputErrado = false;
      } catch (NumberFormatException e) {
        System.out.println("Digite um número válido");
        inputErrado = true;
      }
    }

    System.out.println("Segundo número inteiro: ");

    inputErrado = true;
    while (inputErrado) {
      try {
        String trans = teclado.nextLine();
        y = Integer.parseInt(trans);
        inputErrado = false;
      } catch (NumberFormatException e) {
        System.out.println("Digite um número válido");
        inputErrado = true;
      }
    }

    try {
      double r = (double) x / (double) y;
      System.out.println("Resultado: " + r);
    } catch (Exception e) {
      System.out.println("Divisão por 0 não é aceita.");
    }
    teclado.close();
  }
}
