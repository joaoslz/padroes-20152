package p07_observer.parte1;

import java.time.LocalDate;
import java.util.Calendar;

public class NotaFiscalBuilder {

	NotaFiscal notaFiscal;

	public NotaFiscalBuilder() {
		notaFiscal = new NotaFiscal();
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		notaFiscal.setRazaoSocial(razaoSocial);;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		notaFiscal.setCnpj(cnpj);
		return this;
	}

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
		
		if (notaFiscal.getCnpj() != null) {
			
			// invocando as ações posteriores
		    this.enviaPorEmail(notaFiscal);
		    this.salvaNoBanco(notaFiscal);
		    this.enviaPorSms(notaFiscal);
		    this.imprime(notaFiscal);

			
			return this.notaFiscal;
			
		} else {
			throw new IllegalStateException("Não é possível criar uma nota sem o CNPJ");
		}
	}
	
	
	 
	  private void enviaPorEmail(NotaFiscal notaFiscal2) {
		  System.out.println("enviando por email ...");
	}

	private void salvaNoBanco(NotaFiscal notaFiscal) {
	    System.out.println("salvando no banco");
	  }
	 
	  private void enviaPorSms(NotaFiscal notaFiscal) {
	    System.out.println("enviando por sms");
	  }
	 
	  private void imprime(NotaFiscal notaFiscal) {
	    System.out.println("imprimindo notaFiscal");
	  }

	

}

  
