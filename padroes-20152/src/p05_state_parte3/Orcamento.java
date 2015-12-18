package p05_state_parte3;

public class Orcamento {

	double valor;
	EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		estadoAtual = EstadoDeUmOrcamento.EM_APROVACAO;
	}
	
	public double getValor() {
		return valor;
	}

	public void aprova() {
		estadoAtual =  estadoAtual.aprova(this);

	}

	public void reprova() {
		estadoAtual = estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual = estadoAtual.finaliza(this);
	}

	// ... resto da classe aqui

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	void aplicaDescontoDe5PorCento() {
		this.valor = this.valor * 0.95;
	}
	
	void aplicaDescontoDe2PorCento() {
		this.valor = this.valor * 0.98;
	}

}
