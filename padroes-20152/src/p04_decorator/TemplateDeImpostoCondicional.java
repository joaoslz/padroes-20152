package p04_decorator;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
				
		if (deveAplicarAMaximaTaxacao(orcamento)) {
			// código
			return aplicaMaximaTaxacao(orcamento);
			
		} else {
			return aplicoMinimaTaxacao(orcamento);
		}
		
	}

	protected abstract double aplicoMinimaTaxacao(Orcamento orcamento);

	protected abstract double aplicaMaximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveAplicarAMaximaTaxacao(Orcamento orcamento);

}
