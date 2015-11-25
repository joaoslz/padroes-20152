package p05_state_parte2;

public class Reprovado extends EstadoDeUmOrcamento {
	
	
	@Override
	void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
