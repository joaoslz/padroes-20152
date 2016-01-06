package p09_abstractFactory;
public class CambioManual extends Cambio {
  @Override
  public int getNumeroDeMarchas() {
   return this.numeroDeMarchas;
  }
  @Override
  public void setNumeroDeMarchas(int numeroDeMarchas) {
   this.numeroDeMarchas = numeroDeMarchas;
  }
}
 
// Classe representando um participante ConcreteProduct
