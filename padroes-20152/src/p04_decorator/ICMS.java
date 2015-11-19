package p04_decorator;

public class ICMS extends ImpostoDecorator {
	
	
	public ICMS() {
		super();
	}
	
	public ICMS(Imposto impostoDecorator) {
		super(impostoDecorator);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = 0;
		if (impostoDecorator != null) 
			// regra de negócio
			valor = impostoDecorator.calcula(orcamento);
		    // regra de negócio
		
		return ( orcamento.getValorTotal() * 0.10  ) + valor;
		//return ( orcamento.getValorTotal() * 0.10  ) + super.calcula(orcamento);
		
	}

}
