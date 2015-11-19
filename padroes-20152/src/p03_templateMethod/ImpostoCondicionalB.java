package p03_templateMethod;

class ImpostoCondicionalB extends TemplateDeImpostoCondicional {


	@Override
	protected double aplicoMinimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

	@Override
	protected double aplicaMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.10;
	}

	@Override
	protected boolean deveAplicarAMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValorTotal() > 500 && temItemMaiorQue100ReaisNo(orcamento) );
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValorTotal() > 100)
				return true;
		}

		return false;
	}

}
