package p08_factoryMethod.parte3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class NotaFiscalBuilder {

	NotaFiscal notaFiscal;
	
	Set<AcaoAposGerarNota> acoes;
	
	public NotaFiscalBuilder() {
		notaFiscal = new NotaFiscal();
		acoes = new HashSet<>();
	}
	
	public void registra(AcaoAposGerarNota acao) {
		acoes.add(acao);
	}
	
	public void remove(AcaoAposGerarNota acao) {
		acoes.remove(acao);
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
			
			for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
				acaoAposGerarNota.executa(notaFiscal);
			}
			
			return this.notaFiscal;
			
		} else {
			throw new IllegalStateException("Não é possível criar uma nota sem o CNPJ");
		}
	}
	

	

}

  
