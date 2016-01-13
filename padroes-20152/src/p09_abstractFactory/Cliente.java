package p09_abstractFactory;

public class Cliente {
 
  public static void main(String[] args) {
  
   String opcao = args[0];  
   FabricaDeCarro fabricaDeCarro = null;
 
   if (opcao.equalsIgnoreCase("luxo")) {
     // obtendo a instancia única da fábrica
     fabricaDeCarro = FabricaDeCarroLuxo.getInstance();
     
   } else if (opcao.equalsIgnoreCase("economico")) {
     fabricaDeCarro = new FabricaDeCarroEconomico();
   
   } else {
     System.out.println("opcao invalida. ['luxo' ou 'economico']");
   }
 
   Carro carro = new Carro();
   carro.setCambio(fabricaDeCarro.criaCambio());
   carro.setMotor(fabricaDeCarro.criaMotor());
 
   System.out.println("carro construido: " + carro.toString());
  }
}


