package p06_builder.exemplo3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import p06_builder.Item;
import p06_builder.NotaFiscal;
import p06_builder.NotaFiscalBuilder;

public class NotaFiscalBuilderTest {

	private NotaFiscal nf;

	@Before
	public void setup() {
		
		List<Item> itens = Arrays.asList(
				 new Item("Monitor", new BigDecimal(500), 1), 
				 new Item("Ultrabook", new BigDecimal(2500), 1 ),
				 new Item("Tablet", new BigDecimal(1500), 1 ));
		
		BigDecimal valorBruto = new BigDecimal(0);

		for (Item item : itens) {
			valorBruto.add( item.getSubTotal() );
		}
		
		System.out.println(valorBruto);
		BigDecimal impostos = valorBruto.multiply(new BigDecimal(0.05) );

		nf = new NotaFiscal("razao social qualquer", "123.4567/0001-89", 
				       Calendar.getInstance(), valorBruto, impostos,
				       itens, "observacoes quaisquer aqui");
	
	      NotaFiscalBuilder builder = new NotaFiscalBuilder();
	      
	      nf = builder.paraEmpresa("empresa Xyz")
	    	          .comCnpj("123.4567/0001-89")
	                  .naDataAtual(Calendar.getInstance())
	                  .comItem(new Item("Monitor", new BigDecimal(500), 1))
	                  .comItem(new Item("Ultrabook", new BigDecimal(2500), 1 ))
	                  .comItem(new Item("Tablet", new BigDecimal(1500), 1 ))
	                  .comObservacoes("observacoes quaisquer aqui")
	                  .constroi();
			     
	    
	
	}

	@Test
	public void deveCalcularValorTotal() {
	    double valorEsperado = 4500.0;
	    double valorCalculado = nf.getValorTotal().doubleValue();
		Assert.assertEquals(valorEsperado, valorCalculado, 0.00001);
		
		
		
	}

}
