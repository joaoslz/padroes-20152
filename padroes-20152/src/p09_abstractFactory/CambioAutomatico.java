package p09_abstractFactory;
// Classe representando um participante ConcreteProduct
public class CambioAutomatico extends Cambio {
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
