import java.io.Serializable;

public class Gato implements Serializable {

  private int idade;
  private double peso;
  private String nome;

  public Gato(int idade, double peso, String nome) {
    this.idade = idade;
    this.peso = peso;
    this.nome = nome;
  }

  public Gato() {}

  public String toString() {
    return new String(this.nome + " " + this.idade + " " + this.peso);
  }
}
