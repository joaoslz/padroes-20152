package p04_decorator;

public class ISS extends ImpostoDecorator {
	
	
	public ISS(Imposto impostoDecorator) {
		super(impostoDecorator);
	}
	
	public ISS() {
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		double valor = 0;
		if (impostoDecorator != null) 
			// regra de negócio
			valor = impostoDecorator.calcula(orcamento);
		    // regra de negócio
		
	    return ( orcamento.getValorTotal() * 0.06  ) + valor;

	}

}
