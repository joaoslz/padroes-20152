package p16_adapter.exemplo2;

/*
 *  traduz as chamadas de uma interface para outra.
 */
public class SMSAdapter implements SMSSender {
	private EnviadorSMS env;

	public SMSAdapter(EnviadorSMS env) {
		this.env = env;
	}

	
	/*
	 * (non-Javadoc)
	 * @see p16_adapter.exemplo2.SMSSender#sendSMS(p16_adapter.exemplo2.SMS)
	 * 
	 * Inicialmente recupera as informações do objeto SMS e as atribui a variáveis locais. 
	 * O método quebrarMsgs() é chamado para quebrar o texto da mensagem que 
	 * está em apenas uma string em um array strings com tamanho máximo de 160 caracteres. 
	 * Para lidar com a diferença do retorno, a chamada ao método enviarSMS() 
	 * da classe EnviadorSMS é encapsulada em um bloco try/catch. 
	 * Dessa forma, caso a exceção for capturada o método retorna false, e caso o método 
	 * siga seu fluxo normal, é retornado true.
	 */
	public boolean sendSMS(SMS sms) {
		String dest = sms.getDestino();
		String orig = sms.getOrigem();
		String[] txts = quebrarMsgs(sms.getTexto());
		
		try {
			env.enviarSMS(dest, orig, txts);
		/* Para transformar a exceção recebida em um retorno booleano, 
		 * perdeu-se a mensagem com a causa do erro e outras informações associadas a ela. */
		} catch (SMSException e) {
			return false;
		}
		return true;
	}

	private String[] quebrarMsgs(String text) {
		int size = text.length();
		int qtd = (size % 160 == 0) ? size / 160 : size / 160 + 1;
		String[] msgs = new String[qtd];
		for (int i = 0; i < qtd; i++) {
			int min = i * 160;
			int max = (i == qtd - 1) ? size : (i + 1) * 160;
			msgs[i] = text.substring(min, max);
		}
		return msgs;
	}
}