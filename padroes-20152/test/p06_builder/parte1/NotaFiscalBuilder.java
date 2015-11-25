package p06_builder.parte1;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import p06_builder.Cliente;
import p06_builder.Item;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private BigDecimal valorBruto;
	private BigDecimal impostos;
	public List<Item> itens;
	public String observacoes;
	
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
		
	}
	
	
	
	

}
