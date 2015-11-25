package p06_builder;

import java.math.BigDecimal;

public class Item {
	
	private String nome;
	private BigDecimal valorUnitario;
	private int quantidade;
	
	
	public Item(String nome, BigDecimal valor, int quantidade) {
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
