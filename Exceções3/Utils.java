public class Utils {

  private double temp1;

  public Utils(double temp1) {
    this.temp1 = temp1;
  }

  public double getTemp1() {
    return temp1;
  }

  public void setTemp1(double temp1) {
    this.temp1 = temp1;
  }

  public double toCelsius() throws FException {
    if (getTemp1() < -459.67) {
      throw new FException();
    } else {
      double celsius = (5 * (getTemp1() - 32)) / 9;
      return celsius;
    }
  }
}
