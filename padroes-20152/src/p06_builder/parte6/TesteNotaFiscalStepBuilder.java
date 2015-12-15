package p06_builder.parte6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TesteNotaFiscalStepBuilder {
	
	public static void main(String[] args) {
		
		List<Item> produtosDeInformatica = Arrays.asList(
				      new Item("Monitor", new BigDecimal(500), 1), 
				      new Item("Ultrabook", new BigDecimal(2400), 1),
				      new Item("Tablet", new BigDecimal(900), 1));
		
		NotaFiscal nf = NotaFiscalStepBuilder.newBuilder()
										.paraEmpresa("Empresa Legal")
										.comCNPJ("123.456.00001/1234-0")
				                        .comItens(produtosDeInformatica)
				                        .comObservacoes("Digite a sua sugestão aqui")
				                        .naDataAtual()
				                        .constroi();
		
		//NotaFiscal nf2 = 
				
				NotaFiscalStepBuilder.newBuilder()
				             .paraEmpresa("Empresa xyz")
				             .comCNPJ("123.456.00001")
				             .comItens(produtosDeInformatica)
				             .comObservacoes("Qualquer coisa")
				             .naDataAtual()
				             .constroi();

		System.out.println(nf.getValorBruto());
		System.out.println(nf.getImpostos());
		
	}

}
