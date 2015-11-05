package p02_chain;

class DescontoParaMaisDeCincoItens implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {

		if (orcamento.getQuantidadeDeItens() >= 5) {
			return orcamento.getValorTotal() * 0.10;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
