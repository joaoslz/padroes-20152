package p07_observer.parte2;

public class Impressora implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}
