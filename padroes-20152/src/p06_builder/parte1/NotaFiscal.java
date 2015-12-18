package p06_builder.parte1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	public List<Item> itens;
	public String observacoes;


	NotaFiscal(String razaoSocial, String cnpj, LocalDate dataDeEmissao, BigDecimal valorBruto,
			BigDecimal impostos, List<Item> itens, String observacoes) {

		this.razaoSocial = razaoSocial;
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

	public LocalDate getDataDeEmissao() {
		return dataDeEmissao;
	}
	// public Calendar getDataDeEmissao() {
	// return dataDeEmissao;
	// }

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
		BigDecimal valorTotal = this.valorBruto.add(impostos);
		System.out.println(valorTotal);
		return valorTotal;
	}

	void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	void setDataDeEmissao(LocalDate dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	// void setDataDeEmissao(Calendar dataDeEmissao) {
	// this.dataDeEmissao = dataDeEmissao;
	// }

	void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	void setImpostos(BigDecimal impostos) {
		this.impostos = impostos;
	}

	void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public int getQuantidadeDeItens() {
		return itens.size();
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal;

		if (cnpj != null) {
			notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens, observacoes);
		} else {
			throw new IllegalStateException("Não é possível criar uma nota sem o CNPJ");
		}

		return notaFiscal;
	}

}
