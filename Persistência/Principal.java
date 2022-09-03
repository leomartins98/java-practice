import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("dados.txt", true);
      BufferedWriter writer = new BufferedWriter(fw);
      writer.write("Fustafo 18 10.8");
      writer.newLine();
      writer.write("Canela 18 13.7");
      writer.newLine();
      writer.write("Guga É SÓ PESQUISAR 18 15.9");
      writer.newLine();
      writer.write("Pauloverso 19 16.5");
      writer.newLine();
      writer.write("Kirk 19 15.5");
      writer.newLine();
      writer.write("Danilo 21 16.5");
      writer.close();
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
