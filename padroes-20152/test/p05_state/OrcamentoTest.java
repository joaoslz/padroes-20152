package p05_state;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import p05_state_parte1.Orcamento;

public class OrcamentoTest {

	private Orcamento orcamento;

	@Before
	public void setup() throws Exception {
		orcamento = new Orcamento(500);
	}

	@Test
	public void deveAplicarDescontoExtraDEmOrcamentoEmAprovacao() {
		orcamento.aplicaDescontoExtra();
		double valorCalculado = orcamento.getValor();
		double valorEsperado = 500 * 0.95;
		Assert.assertEquals(valorEsperado, valorCalculado, 0.000001);
	}
	
	@Test
	public void deveAplicarDescontoExtraEmOrcamentoAprovado() {
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		double valorCalculado = orcamento.getValor();
		double valorEsperado = 500 * 0.98;
		Assert.assertEquals(valorEsperado, valorCalculado, 0.000001);
	}

	@Test(expected=IllegalStateException.class)
	public void naoDeveAplicarDescontoExtraEmOrcamentoReprovado() {
		orcamento.reprova();
		orcamento.aplicaDescontoExtra();
	}
	
	@Test(expected=IllegalStateException.class)
	public void naoDeveAplicarDescontoExtraEmOrcamentoFinalizado() {
		orcamento.aprova();
		orcamento.finaliza();
		orcamento.aplicaDescontoExtra();
	}

}
