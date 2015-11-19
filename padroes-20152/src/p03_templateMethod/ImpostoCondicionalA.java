
package p03_templateMethod;

class ImpostoCondicionalA extends TemplateDeImpostoCondicional {

	@Override
	protected double aplicoMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.05;
		
	}

	@Override
	protected double aplicaMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.07;
		
	}

	@Override
	protected boolean deveAplicarAMaximaTaxacao(Orcamento orcamento) {
		
		return (orcamento.getValorTotal() > 500);
	}
}
