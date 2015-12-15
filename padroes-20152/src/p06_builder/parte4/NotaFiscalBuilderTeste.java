package p06_builder.parte4;

import java.math.BigDecimal;

public class NotaFiscalBuilderTeste {
	
	public static void main(String[] args) {
		
		 NotaFiscalBuilder builder = new NotaFiscalBuilder();
		 
		 	      
	      NotaFiscal nf = 
	    		  
	    		  builder.paraEmpresa("empresa Xyz")
	    	          .comCnpj("123.4567/0001-89")
	                  .naDataAtual()
	                  .comItem(new Item("Monitor", new BigDecimal(500), 1))
	                  .comItem(new Item("Ultrabook", new BigDecimal(2500), 1 ))
	                  .comItem(new Item("Tablet", new BigDecimal(1500), 1 ))
	                  .comObservacoes("observacoes quaisquer aqui")
	                  .comNumero(1234)
	                  .constroi();
	}

}
