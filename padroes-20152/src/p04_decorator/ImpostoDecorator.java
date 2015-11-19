package p04_decorator;

public abstract class ImpostoDecorator implements Imposto {
	
	protected Imposto impostoDecorator;
	
	public ImpostoDecorator() {
	}

	public ImpostoDecorator(Imposto impostoDecorator) {
		super();
		this.impostoDecorator = impostoDecorator;
	}
	
//	@Override
//	public double calcula(Orcamento orcamento) {
//		return (impostoDecorator == null) ? 
//                0  : impostoDecorator.calcula(orcamento);
//	}
	
	


}
