public class Main {

  public static void main(String[] args) {
    Utils temp = new Utils(-560);
    try {
      System.out.println(temp.toCelsius());
    } catch (FException e) {
      System.out.println(e);
    }
  }
}
