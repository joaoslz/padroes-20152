package p06_builder;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private Cliente cliente;
	private String cnpj;
	private Calendar dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	public List<Item> itens;
	public String observacoes;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, BigDecimal valorBruto,
			BigDecimal impostos, List<Item> itens, String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cliente = cliente;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
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

}
