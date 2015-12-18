package p05_state_parte2;
public class Orcamento {
	
	EstadoDeUmOrcamento estadoAtual;
	
	double valor;
	
	public double getValor() {
		return valor;
	}

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
		
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	
	public void aprova() {
		estadoAtual.aprova(this);
		
	}
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
	

}