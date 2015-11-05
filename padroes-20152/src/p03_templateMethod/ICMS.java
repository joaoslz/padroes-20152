package p03_templateMethod;

public class ICMS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.10;
		
	}

}
