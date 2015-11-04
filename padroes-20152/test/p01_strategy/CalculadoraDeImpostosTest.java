package p01_strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeImpostosTest {

	private CalculadoraDeImpostos calculadoraDeImpostos;
	private Orcamento orcamento;

	@Before
	public void setup() {
		calculadoraDeImpostos = new CalculadoraDeImpostos();
		orcamento = new Orcamento();
		
	}
	
	@Test
	public void deveCalcularICMS() {
		orcamento.adicionaItem(new Item("Notebook", 2500, 1));
		assertEquals( 250, calculadoraDeImpostos.realizaCalculo(orcamento, new ICMS()), 0.00001);
	}

	
	@Test
	public void deveCalcularISS() {
		orcamento.adicionaItem(new Item("Notebook", 2500, 1));
		assertEquals( (2500 * 0.06), calculadoraDeImpostos.realizaCalculo(orcamento, new ISS()), 0.00001);
	}
	
//	@Test(expected = NullPointerException.class)
//	public void naoDeveCalcularImpostoInvalido() {
//		orcamento.adicionaItem(new Item("Notebook", 2500, 1));
//		calculadoraDeImpostos.realizaCalculo(orcamento, null);
//	}
	

}
