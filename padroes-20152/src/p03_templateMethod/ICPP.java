
package p03_templateMethod;

class ICPP implements Imposto {

    public double calcula(Orcamento orcamento) {
   
      if(orcamento.getValorTotal() > 500) {
        return orcamento.getValorTotal() * 0.07;
     
      } else {
        return orcamento.getValorTotal() * 0.05;
      }
    }
}
