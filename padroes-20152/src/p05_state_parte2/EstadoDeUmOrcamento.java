package p05_state_parte2;

public abstract class EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento) {
		throw new IllegalStateException("Não é possível aplica desconto extra");

	}

	void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento não pode ser aprovado");
	}

	void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento não pode ser Reprovado");
	}

	void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já Finalizado");

	}
	
}
