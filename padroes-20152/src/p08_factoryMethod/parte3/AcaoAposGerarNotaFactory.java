package p08_factoryMethod.parte3;

import java.io.FileInputStream;
import java.util.Properties;

public class AcaoAposGerarNotaFactory {
 
	private Properties apelidosComandos = new Properties();

	public AcaoAposGerarNotaFactory() {
		try {
			apelidosComandos.load(new FileInputStream("./properties/commands.properties"));
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao carregar o arquivo commands.properties");
		}
	}

	public AcaoAposGerarNota create(String name) {
		AcaoAposGerarNota acao = null;
		
		String stringClasse = apelidosComandos.getProperty(name);
		
		System.out.println("Classe " + stringClasse);
		try {
			Class classe = Class.forName(stringClasse);
			Object object = classe.newInstance();
			acao = (AcaoAposGerarNota) object;

		} catch (Exception trateme) {
			trateme.printStackTrace();
			throw new RuntimeException("Erro ao carregar o arquivo commands.properties\n\n " );
		}
		return acao;
	}

}





/*
	private static Properties apelidosComandos = new Properties();

	static {
		try {
			apelidosComandos.load(new FileInputStream("./properties/commands.properties"));
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao carregar o arquivo commands.properties");
		}
	}

	public static AcaoAposGerarNota create(String name) {
		AcaoAposGerarNota command = null;
		String stringClasse = apelidosComandos.getProperty(name);
		System.out.println("Classe " + stringClasse);
		try {
			Class classe = Class.forName(stringClasse);
			Object object = classe.newInstance();
			command = (AcaoAposGerarNota) object;

		} catch (Exception trateme) {
			trateme.printStackTrace();
			throw new RuntimeException("Erro ao carregar o arquivo commands.properties\n\n " );
		}
		return command;
	}

 */
