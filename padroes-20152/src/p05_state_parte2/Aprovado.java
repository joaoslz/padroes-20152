package p05_state_parte2;

public class Aprovado extends EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor * (1 - 0.02);

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
