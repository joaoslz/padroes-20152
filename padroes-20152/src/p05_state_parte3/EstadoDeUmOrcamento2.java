package p05_state_parte3;

public enum EstadoDeUmOrcamento2 {
	
	
	EM_APROVACAO {
		@Override
		void aplicaDescontoExtra(Orcamento orcamento) {
			orcamento.aplicaDescontoDe5PorCento();
		}

		@Override
		EstadoDeUmOrcamento2 aprova(Orcamento orcamento) {
			return EstadoDeUmOrcamento2.APROVADO;
		}

		@Override
		EstadoDeUmOrcamento2 finaliza(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento em aprovação não pode ser finalizado");
		}

		@Override
		EstadoDeUmOrcamento2 reprova(Orcamento orcamento) {
			return EstadoDeUmOrcamento2.REPROVADO;
		}
		
	}, APROVADO {
		@Override
		void aplicaDescontoExtra(Orcamento orcamento) {
			orcamento.aplicaDescontoDe2PorCento();
		}

		@Override
		EstadoDeUmOrcamento2 aprova(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento jáo foi aprovado previamente");
		}

		@Override
		EstadoDeUmOrcamento2 finaliza(Orcamento orcamento) {
			return EstadoDeUmOrcamento2.FINALIZADO;
		}

		@Override
		EstadoDeUmOrcamento2 reprova(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento Aprovado não pode ser Reprovado");
		}
	
	}, REPROVADO {
		@Override
		void aplicaDescontoExtra(Orcamento orcamento) {
			throw new IllegalStateException("Não é possível aplicar desconto extra em Orcamento Reprovado");
		}

		@Override
		EstadoDeUmOrcamento2 aprova(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento Reprovado não pode ser Aprovado");

		}

		@Override
		EstadoDeUmOrcamento2 finaliza(Orcamento orcamento) {
			return EstadoDeUmOrcamento2.FINALIZADO;
		}

		@Override
		EstadoDeUmOrcamento2 reprova(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento já foi Reprovado previamente");

		}
		
	}, FINALIZADO {
		@Override
		void aplicaDescontoExtra(Orcamento orcamento) {
			throw new IllegalStateException("Não é possível aplicar desconto extra em orçamento finalizado");
		}

		@Override
		EstadoDeUmOrcamento2 aprova(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento já foi Finalizado");

		}

		@Override
		EstadoDeUmOrcamento2 finaliza(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento já foi Finalizado");
		}

		@Override
		EstadoDeUmOrcamento2 reprova(Orcamento orcamento) {
			throw new IllegalStateException("Orcamento já foi Finalizado");
		}
	} ;

	abstract void aplicaDescontoExtra(Orcamento orcamento);
	abstract EstadoDeUmOrcamento2 aprova(Orcamento orcamento);
	abstract EstadoDeUmOrcamento2 finaliza(Orcamento orcamento);
	abstract EstadoDeUmOrcamento2 reprova(Orcamento orcamento);

}
