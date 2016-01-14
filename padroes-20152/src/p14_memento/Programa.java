package p14_memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		
 		        
		    Contrato contrato = new Contrato(
		    		Calendar.getInstance(), 
		    		"Fulano", 
		    		TipoContrato.NOVO);

		    Zelador zelador = new Zelador();
		    Historico historico = zelador.criarMemento();
		    zelador.adicionaMementoNo(historico, contrato);

		    contrato.avanca();
		    zelador.adicionaMementoNo(historico, contrato);

		    contrato.avanca();
		    zelador.adicionaMementoNo(historico, contrato);

		    contrato.avanca();
		    zelador.adicionaMementoNo(historico, contrato);
		    
		    contrato.restaura( zelador.restaura() );

	}

}
