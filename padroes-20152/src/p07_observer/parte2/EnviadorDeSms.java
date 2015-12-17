package p07_observer.parte2;

public class EnviadorDeSms implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por sms");
	}
}
