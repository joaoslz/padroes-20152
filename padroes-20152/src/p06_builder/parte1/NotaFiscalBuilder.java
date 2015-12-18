package p06_builder.parte1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<Item> itens;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	private String observacoes;
	private LocalDate dataDeEmissao;
	

	public NotaFiscalBuilder() {
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
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
		NotaFiscal notaFiscal;
		if (cnpj != null) {
			notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto,
					impostos, itens, observacoes);
		} else {
			throw new IllegalStateException(
					"Não é possível criar nota fiscal sem CNPJ");
		}
		return notaFiscal;
	}
}

  
