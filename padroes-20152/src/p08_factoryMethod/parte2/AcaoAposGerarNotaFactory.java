package p08_factoryMethod.parte2;

public abstract class AcaoAposGerarNotaFactory {

	public static AcaoAposGerarNota create(TipoAcaoAposGerarNota tipo) {
	     return tipo.getAcaoAposGerarNota();
	}
	
}
