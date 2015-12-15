package p06_builder.parte5;

import java.math.BigDecimal;



public class TesteNotaFiscalBuilderAnonimo {
	
	
	
	public static void main(String[] args) {
		 //NotaFiscal notaFiscal = new NotaFiscal();
		
		
//		NotaFiscal nf = notaFiscal.new NotaFiscalBuilder("Empresa XYZ", "123.456")
		NotaFiscal nf = new NotaFiscal.NotaFiscalBuilder("Empresa XYZ", "123.456")
				
				                        .comItem(new Item("Monitor", new BigDecimal(500), 1))
				  				        .comItem(new Item("Ultrabook", new BigDecimal(2400), 1))
				                        .naDataAtual()
				                        .comObservacoes("Digite a sua sugestão aqui")
				                        .constroi();

		System.out.println(nf.getValorBruto());
	}

}
