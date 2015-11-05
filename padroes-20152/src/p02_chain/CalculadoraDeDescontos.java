package p02_chain;
public class CalculadoraDeDescontos {

  public double calcula(Orcamento orcamento) {
	  
	  Desconto d1 = new DescontoParaMaisDeCincoItens();
	  Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
	  Desconto d3 = new SemDesconto();
	  
	  d1.setProximo(d2);
	  d2.setProximo(d3);
	  
	  
	  return d1.desconta(orcamento);
	  

// verifica primeira regra de possível desconto
//    if(orcamento.getQuantidadeDeItens() >= 5) {
//      return orcamento.getValorTotal() * 0.10;
//    }
//     
//    // verifica segunda regra de possível desconto
//    else if(orcamento.getValorTotal() > 500.0) {
//      return orcamento.getValorTotal() * 0.05;
//    }
//   
//     
//    // verifica terceira, quarta, quinta regra de 
//    // possível desconto  ...
//    // um monte de ifs daqui pra baixo
//    
//    return 0;
  }
}
