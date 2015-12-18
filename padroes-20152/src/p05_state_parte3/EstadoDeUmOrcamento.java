package p05_state_parte3;

public enum EstadoDeUmOrcamento {
	
	EM_APROVACAO {
		@Override
		void aplicaDescontoExtra(Orcamento orcamento) {
			orcamento.aplicaDescontoDe5PorCento();
		}
		@Override
		EstadoDeUmOrcamento aprova(Orcamento orcamento) {
			return EstadoDeUmOrcamento.APROVADO;
		}

		
		@Override
		EstadoDeUmOrcamento reprova(Orcamento orcamento) {
			return EstadoDeUmOrcamento.REPROVADO;
		}
		
	}, APROVADO {
		@Override
		void aplicaDescontoExtra(Orcamento orcamento) {
			orcamento.aplicaDescontoDe2PorCento();
		}

		@Override
		EstadoDeUmOrcamento finaliza(Orcamento orcamento) {
			return EstadoDeUmOrcamento.FINALIZADO;
		}

	
	}, REPROVADO {
		@Override
		EstadoDeUmOrcamento finaliza(Orcamento orcamento) {
			return EstadoDeUmOrcamento.FINALIZADO;
		}

	}, FINALIZADO;

	void aplicaDescontoExtra(Orcamento orcamento) {
		throw new IllegalStateException("Não é possível aplicar desconto extra");
	}
	EstadoDeUmOrcamento aprova(Orcamento orcamento) {
		throw new IllegalStateException("Orcamento não pode ser Aprovado");

	}
	EstadoDeUmOrcamento finaliza(Orcamento orcamento) {
		throw new IllegalStateException("Orcamento não pode ser Finalizado");

	}
	EstadoDeUmOrcamento reprova(Orcamento orcamento) {
		throw new IllegalStateException("Orcamento não pode ser Reprovado");

	}

}
