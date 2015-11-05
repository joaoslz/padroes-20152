package p02_chain;

class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {

		if (orcamento.getValorTotal() > 500) {
			return orcamento.getValorTotal() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		

	}
}
