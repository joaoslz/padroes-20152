package p05_state_parte1;
public class Orcamento {
	
	private static final int EM_APROVACAO = 0;
	private static final int APROVADO = 1;
	private static final int REPROVADO = 2;
	private static final int FINALIZADO = 3;
	
	private int estadoAtual ;
	
	private double valor;
	
	public double getValor() {
		return valor;
	}

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = EM_APROVACAO;
		
	}
	
	public void aplicaDescontoExtra() {
		if (estadoAtual == EM_APROVACAO) {
			aplicaDescontoDe5Porcento();
		
		} else if (estadoAtual == APROVADO) {
			aplicaDescontoDe2Porcento();
			
		} else {
			throw new IllegalStateException("Não é possível aplica desconto extra");
		}
	}

	public double aplicaDescontoDe2Porcento() {
		return this.valor -= this.valor * 0.02;
	}

	public void aplicaDescontoDe5Porcento() {
		this.valor -= this.valor * 0.05;
	}
	
	public void aprova() {
		switch (estadoAtual) {
		
		case EM_APROVACAO:
			estadoAtual = APROVADO;
			break;
		case APROVADO:
			throw new RuntimeException("Orcamento já foi aprovado previamente");
		
		case REPROVADO:
			throw new RuntimeException("Orcamento REPROVADO não pode ser Aprovado");
		
		case FINALIZADO:
			throw new RuntimeException("Orcamento já Finalizado");
		}
	}
	public void reprova() {
		switch (estadoAtual) {
		
		case EM_APROVACAO:
		case APROVADO:
			estadoAtual = REPROVADO;
			break;
		case REPROVADO:
			throw new RuntimeException("Orcamento já foi REPROVADO anteriormete");
		
		case FINALIZADO:
			throw new RuntimeException("Orcamento já Finalizado");
		}
	}	
	
	public void finaliza() {
		switch (estadoAtual) {
		
		case EM_APROVACAO:
			throw new RuntimeException("Orcamento EM_APROVA��O nao pode ser finalizado");
		
		case APROVADO:
		case REPROVADO:
			estadoAtual = FINALIZADO;
			break;
		
		case FINALIZADO:
			throw new RuntimeException("Orcamento já Finalizado previamente");
		}
	}	

}