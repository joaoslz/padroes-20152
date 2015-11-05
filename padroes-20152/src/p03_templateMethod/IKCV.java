package p03_templateMethod;
class IKCV implements Imposto {
 
 public double calcula(Orcamento orcamento) {
  
    if(orcamento.getValorTotal() > 500 && 
                          temItemMaiorQue100ReaisNo(orcamento)) {
        return orcamento.getValorTotal() * 0.10;
    } else {
        return orcamento.getValorTotal() * 0.06;
    }
  }
     
  private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
    for(Item item : orcamento.getItens()) {
       if(item.getValorTotal() > 100) return true;
    }
       
    return false;
  }
}
