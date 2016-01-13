package p12_singleton;

public class Configuracao {
	
	private static Configuracao instancia;

	public synchronized static Configuracao getInstancia() {
		if (instancia == null)
			instancia = new Configuracao();
		return instancia;
	}

	// Construtor privado!
	private Configuracao() {
		// lê as configurações
	}
	// ...
}
