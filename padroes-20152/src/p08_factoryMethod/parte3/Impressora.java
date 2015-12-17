package p08_factoryMethod.parte3;

public class Impressora implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}
