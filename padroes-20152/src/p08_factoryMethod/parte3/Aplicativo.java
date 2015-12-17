package p08_factoryMethod.parte3;

public class Aplicativo {
	
	public static void main(String[] args) {
		
		AcaoAposGerarNota email = new AcaoAposGerarNotaFactory().create("email");
		
		email.executa( new NotaFiscal() );
	}

}
