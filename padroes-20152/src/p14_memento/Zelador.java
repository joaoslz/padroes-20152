package p14_memento;

import java.util.Calendar;

public class Zelador {
	
	
	Historico criarMemento() {
		return new Historico();
	}
	
	public void adicionaMementoNo(Historico historico, Contrato contrato) {
		historico.adiciona( contrato.salvaEstado() );
	}

 }