package p08_factoryMethod.parte2;

public enum TipoAcaoAposGerarNota {
	
	EMAIL ( new EnviadorDeEmail() ),
	SMS( new EnviadorDeSms() ),
	IMPRESSORA ( new Impressora() ),
	DAO ( new NotaFiscalDao() );
	
	private AcaoAposGerarNota acaoAposGerarNota;

	private TipoAcaoAposGerarNota(AcaoAposGerarNota acao) {
		this.acaoAposGerarNota = acao;
	}
	
	public AcaoAposGerarNota getAcaoAposGerarNota() {
		return acaoAposGerarNota;
	}

}
