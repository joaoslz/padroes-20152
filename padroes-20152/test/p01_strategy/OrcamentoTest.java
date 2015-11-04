package p01_strategy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import p01_strategy.Orcamento;

public class OrcamentoTest {
	
	private Orcamento orcamento;

	@Before
	public void setup() {
		orcamento = new Orcamento();
	}

	@Test
	public void deveCalcularValorTotalParaOrcamentoVazio() {
		assertEquals(0, orcamento.getValorTotal(), 0.000001 );
	}
	
	@Test
	public void deveAdcionarUmItemNoOrcamentoECalcularOValorTotal() {
		orcamento.adicionaItem( new Item("Caneta", 5.0, 10) );
		assertEquals(1, orcamento.getQuantidadeDeItens() );
		assertEquals(50, orcamento.getValorTotal(), 0.000001 );

		
	}
	
	@Test
	public void deveAdcionarDoisItensNoOrcamento() {
		orcamento.adicionaItem( new Item("Caneta", 5.0, 10) );
		orcamento.adicionaItem( new Item("Lapis", 3.0, 5) );
		assertEquals(2, orcamento.getQuantidadeDeItens() );
	}
	
	@Test
	public void naoPermiteDoisItensIguaisNoOrcamento() {
		assertTrue(orcamento.adicionaItem( new Item("Caneta", 5.0, 10) ) );
		assertFalse(orcamento.adicionaItem( new Item("Caneta", 5.0, 10) ) );
		
		
		
	}


}
