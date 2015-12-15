package p06_builder;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
   private NotaFiscal notaFiscal;
   
   public NotaFiscalBuilder() {
	this.notaFiscal = new NotaFiscal();
}
   
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		notaFiscal.setRazaoSocial(razaoSocial);
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		notaFiscal.setCnpj(cnpj);
		return this;
		
	}

	public NotaFiscalBuilder naDataAtual() {
		notaFiscal.setDataDeEmissao( Calendar.getInstance() );
		
		return this;
	}

	public NotaFiscalBuilder comItem(Item item) {
		
		notaFiscal.adiciona(item);
		
		
		
		
		
		return this;
		
	}
	
	
	
	public NotaFiscal constroi() {
		
		return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, 
				impostos, itens, observacoes);
				
	}
	
	
	
	

}
