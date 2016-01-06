package p09_abstractFactory;
public class MotorGasolina extends Motor {
  @Override
  public int getCilindrada() {
   return this.cilindrada;
  }
  @Override
  public void setCilindrada(int cilindrada) {
   this.cilindrada = cilindrada;
  }
}
 
// Classe representando um participante ConcreteProduct
