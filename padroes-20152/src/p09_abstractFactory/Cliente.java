package p09_abstractFactory;
public class Cliente {
 
  public static void main(String[] args) {
  
   String opcao = args[0];  
   FabricaDeCarro fabricaDePeca = null;
 
   if (opcao.equalsIgnoreCase("luxo")) {
     // obtendo a instancia única da fábrica
     fabricaDePeca = FabricaDeCarroLuxo.getInstance();
   } else if (opcao.equalsIgnoreCase("economico")) {
     fabricaDePeca = new FabricaDeCarroEconomico();
   } else {
     System.out.println("opcao invalida. ['luxo' ou 'economico']");
   }
 
   Carro carro = new Carro();
   carro.setCambio(fabricaDePeca.criaCambio());
   carro.setMotor(fabricaDePeca.criaMotor());
 
   System.out.println("carro construido: " + carro.toString());
  }
}


