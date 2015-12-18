package p08_factoryMethod.parte1;

import java.math.BigDecimal;

public class Item {
	
	private String nome;
	private BigDecimal valorUnitario;
	private Integer quantidade;
	
	
	public Item(String nome, BigDecimal valor, Integer quantidade) {
		this.nome = nome;
		this.valorUnitario = valor;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public BigDecimal getValorUnitario() {
		return this.valorUnitario;
	}
	
	public BigDecimal getSubTotal() {
		return this.valorUnitario.multiply(new BigDecimal(quantidade) ); 
	}
}
