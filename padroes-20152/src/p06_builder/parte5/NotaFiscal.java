package p06_builder.parte5;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public  class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	public List<Item> itens;
	public String observacoes;
	
	public NotaFiscal() {
		
	}

	private NotaFiscal(NotaFiscalBuilder builder) {
		this.razaoSocial = builder.razaoSocial;
		this.cnpj = builder.cnpj;
		this.dataDeEmissao = builder.dataDeEmissao;
		this.valorBruto = builder.valorBruto;
		this.impostos = builder.impostos;
		this.itens = builder.itens;
		this.observacoes = builder.observacoes;
	}
	
	
	public static class NotaFiscalBuilder {
		private String razaoSocial;
		private String cnpj;
		private List<Item> itens;
		private BigDecimal valorBruto;
		private BigDecimal impostos;
		private String observacoes;
		private LocalDate dataDeEmissao;
		

		public NotaFiscalBuilder(String razaoSocial, String cnpj) {
			this.razaoSocial = razaoSocial;
			this.cnpj = cnpj;
		}

		public NotaFiscalBuilder comItem(Item item) {

			if (this.itens == null) {
				this.itens = new ArrayList<>();
				this.valorBruto = BigDecimal.ZERO;
				this.impostos = BigDecimal.ZERO;
			}
			itens.add(item);
			valorBruto =  valorBruto.add(item.getValorUnitario() );
			impostos = impostos
					       .add( item.getValorUnitario()
					                 .multiply(new BigDecimal(0.05) ) );
			return this;
		}

		public NotaFiscalBuilder comObservacoes(String observacoes) {
			this.observacoes = observacoes;
			return this;
		}

		public NotaFiscalBuilder naDataAtual() {
			dataDeEmissao = LocalDate.now();
			return this;
		}

		public NotaFiscal constroi() {
			return new NotaFiscal(this);
		}

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

	
}




