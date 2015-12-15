package p06_builder.parte3;

import java.time.LocalDate;
import java.util.Calendar;

public class NotaFiscalBuilder {

	NotaFiscal notaFiscal;

	public NotaFiscalBuilder(String razaoSocial, String cnpj) {
		notaFiscal = new NotaFiscal(razaoSocial, cnpj);
	}
	
//	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
//		notaFiscal.setRazaoSocial(razaoSocial);;
//		return this;
//	}
//
//	public NotaFiscalBuilder comCnpj(String cnpj) {
//		notaFiscal.setCnpj(cnpj);
//		return this;
//	}

	public NotaFiscalBuilder comItem(Item item) {
		notaFiscal.adiciona(item);
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		notaFiscal.setObservacoes(observacoes);
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		//notaFiscal.setDataDeEmissao( Calendar.getInstance() );
		notaFiscal.setDataDeEmissao( LocalDate.now() );
		return this;
	}
	

	public NotaFiscal constroi() {
		
			return this.notaFiscal;
	}

}

  
