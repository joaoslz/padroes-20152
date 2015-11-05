package p02_chain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeDescontosTest {

	private CalculadoraDeDescontos calculadorDeDescontos;
	private Orcamento orcamento;

	@Before
	public void setup() {
		calculadorDeDescontos = new CalculadoraDeDescontos();
		orcamento = new Orcamento();
	}

	@Test
	public void deveAplicarDescontoParaOrcamentoAcimaDe500Reais() {
		orcamento.adicionaItem(new Item("Notebook", 300, 1));
		orcamento.adicionaItem(new Item("Table", 200, 1));
		orcamento.adicionaItem(new Item("Smartphone", 100, 1));
		
		assertEquals(30.0, 
				     calculadorDeDescontos.calcula(orcamento), 0.00001);
		
	}
	
	@Test
	public void deveAplicarDescontoParaOrcamentoComMaisDeQuatroItens() {
		orcamento.adicionaItem(new Item("Notebook", 300, 1));
		orcamento.adicionaItem(new Item("Table", 200, 1));
		orcamento.adicionaItem(new Item("Smartphone", 100, 1));
		orcamento.adicionaItem(new Item("Smartphone2", 100, 1));
		orcamento.adicionaItem(new Item("Smartphone3", 100, 1));
		
		
		
		assertEquals(80.0, 
				     calculadorDeDescontos.calcula(orcamento), 0.00001);
		
	}
	
	
	@Test
	public void naoDeveAplicarDesconto() {
		orcamento.adicionaItem(new Item("Notebook", 200, 1));
		orcamento.adicionaItem(new Item("Table", 100, 1));
		
		int valorEsperado = 0;
		assertEquals(valorEsperado, 
				     calculadorDeDescontos.calcula(orcamento), 0.00001);
		
	}

}
