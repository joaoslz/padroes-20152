package p14_memento;

import java.util.Calendar;

public class Zelador {
	
	private Historico historico;

	Historico criarMemento() {
		historico = new Historico();
		return historico;
	}
	
	public void adicionaMementoNo(Historico historico, Contrato contrato) {
		historico.adiciona( contrato.salvaEstado() );
	}
	
	public Memento restaura() {
		 return historico.pega(0);
	}
	

 }