package p08_factoryMethod.parte1;

import java.util.HashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;

public abstract class AcaoAposGerarNotaFactory {

	private static final String EMAIL = "email";
	private static final String SMS = "sms";
	private static final String IMPRESSORA = "impressora";
	private static final String DAO = "dao";
	
	private static Map<String, AcaoAposGerarNota> objAcoes;
	
	static  {
		objAcoes = new HashMap<>(4);
	
		objAcoes.put(EMAIL, new EnviadorDeEmail());
		objAcoes.put(SMS, new EnviadorDeEmail());
		objAcoes.put(IMPRESSORA, new EnviadorDeEmail());
		objAcoes.put(DAO, new EnviadorDeEmail());
	}
	
	public static AcaoAposGerarNota create(String name) {
	     return objAcoes.get(name);
	}
	
	public static void main(String[] args) {
		AcaoAposGerarNotaFactory.create("sms");
	}
	
}
