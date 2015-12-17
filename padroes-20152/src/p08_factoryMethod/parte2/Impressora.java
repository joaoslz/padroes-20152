package p08_factoryMethod.parte2;

public class Impressora implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}
