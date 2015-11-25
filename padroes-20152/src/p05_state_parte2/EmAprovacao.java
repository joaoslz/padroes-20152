package p05_state_parte2;

class EmAprovacao extends EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor  * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}
}
