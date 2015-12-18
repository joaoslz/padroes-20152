package p07_observer.parte2;

public class NotaFiscalDao implements AcaoAposGerarNota {
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}
}
