import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) {
    Gato g1 = new Gato(1, 5.4, "Garfield");
    Gato g2 = new Gato(3, 2.3, "Cuevas");
    Gato g3 = new Gato(4, 3.6, "Tareco");
    try {
      FileOutputStream fw = new FileOutputStream("gatos.txt");
      ObjectOutputStream obj = new ObjectOutputStream(fw);

      obj.writeObject(g1);
      obj.writeObject(g2);
      obj.writeObject(g3);

      obj.close();
      fw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    Gato g4;
    Gato g5;
    Gato g6;
    try {
      FileInputStream fin = new FileInputStream("gatos.txt");
      ObjectInputStream ois = new ObjectInputStream(fin);

      g4 = (Gato) ois.readObject();
      g5 = (Gato) ois.readObject();
      g6 = (Gato) ois.readObject();

      ois.close();
      fin.close();
      System.out.println(g4.toString());
      System.out.println(g5.toString());
      System.out.println(g6.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
