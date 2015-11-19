package p03_templateMethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemplateDeImpostoCondicionalTest {

	private Orcamento orcamento;

	@Before
	public void setup()  {
		orcamento = new Orcamento();
	}

	@Test
	public void deveCalcalcularNaMinimaTaxacaoImpostoCondicionalA() {
		orcamento.adicionaItem(new Item("Table", 200, 1));
		double valorEsperado  = 200 * 0.05;
		Imposto impostoCondicionalA = new ImpostoCondicionalA();
		assertEquals(valorEsperado, impostoCondicionalA.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void deveCalcalcularNaMaximaTaxacaoImpostoCondicionalA() {
		orcamento.adicionaItem(new Item("Notebook", 600, 1));
		double valorEsperado  = 600 * 0.07;
		Imposto impostoCondicionalA = new ImpostoCondicionalA();
		assertEquals(valorEsperado, impostoCondicionalA.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void deveCalcalcularNaMinimaTaxacaoImpostoCondicionalB() {
		orcamento.adicionaItem(new Item("Pen driver", 80, 1));
		double valorEsperado  = 80  * 0.06;
		Imposto impostoCondicionalB = new ImpostoCondicionalB();
		assertEquals(valorEsperado, impostoCondicionalB.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void deveCalcalcularNaMaximaTaxacaoImpostoCondicionalB() {
		orcamento.adicionaItem(new Item("Table", 200, 1));
		orcamento.adicionaItem(new Item("Notebook", 700, 1));
		double valorEsperado  = 900 * 0.10;
		Imposto impostoCondicionalB = new ImpostoCondicionalB();
		assertEquals(valorEsperado, impostoCondicionalB.calcula(orcamento), 0.00001);
	}
	

}
