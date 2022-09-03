public class FException extends TemperatureException {

  @Override
  public String getMessage() {
    
    return "Temperatura menor que o Zero Absoluto.";
  }
}
