package p04_decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ImpostosComplexosTest {

	private Orcamento orcamento;

	@Before
	public void setup()  {
		orcamento = new Orcamento();
		
	}

	@Test
	public void deveCalcularIcmsComIss() {
		orcamento.adicionaItem(new Item("Table", 200, 1));
		double valorEsperado  = 200 * 0.16;
		
		ICMS icms = new ICMS(new ISS( new ImpostoCondicionalA() ));
		
		assertEquals( valorEsperado, icms.calcula(orcamento), 0.00001 );
		
		
	}

}
