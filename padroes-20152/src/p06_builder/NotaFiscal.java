package p06_builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import p01_strategy.Imposto;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	public List<Item> itens;
	public String observacoes;
	
	NotaFiscal() {
		this.valorBruto = BigDecimal.ZERO;	
		this.impostos = BigDecimal.ZERO;
	}
	

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public BigDecimal getImpostos() {
		return impostos;
	}

	public List<Item> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}
	
	public BigDecimal getValorTotal() {
		return this.valorBruto.add(impostos);
	}


	void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	void setDataDeEmissao(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}


	void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}


	void setImpostos(BigDecimal impostos) {
		this.impostos = impostos;
	}


	void setItens(List<Item> itens) {
		this.itens = itens;
	}


	void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public void adiciona(Item item) {
		
		if (this.itens == null) {
			this.itens = new ArrayList<>();
		}
		
		valorBruto  = valorBruto.add( item.getSubTotal() );
		
		
		BigDecimal imposto = item.getSubTotal().multiply(new BigDecimal(0.05));
		
		impostos = impostos.add( impostos.multiply( imposto ));
		
		
		
		
	}
	
	
	

}
