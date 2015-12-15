package p06_builder.parte4;

public class NotaFiscalBuilderValido {
	
	
	private NotaFiscal notaFiscal;


	NotaFiscalBuilderValido(NotaFiscal nf) {
		this.notaFiscal = nf;
		// processamento adicional
	}
	
	public NotaFiscal constroi() {
		return notaFiscal;
	}

}
