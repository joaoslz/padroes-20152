package p08_factoryMethod.parte2;

public class NotaFiscalDao implements AcaoAposGerarNota {
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}
}
