package p16_adapter.exemplo2;


/*
 * Ao evoluir a aplicação, foi necessário incorporar o serviço de envio de SMS de
   uma outra operadora. Não foi uma surpresa muito grande quando foi constatado
   que a API para o acesso a funcionalidade era completamente diferente. A listagem
   com a interface dessa nova API, EnviadorSMS, está representada a seguir.
 */

public interface EnviadorSMS {
	
	/*
	 * A primeira diferença está nos parâmetros, que em vez de serem encapsulados em uma
      classe, no caso a SMS, são passado diretamente para o método. Outra diferença
      é que o texto da mensagem não é mais uma string, mas um array de strings. A
      primeira API recebia um texto longo e dividia em várias mensagens se necessário,
      porém nessa outra API a mensagem precisa ser divida em trechos de 160 caracteres
      antes da chamada do método. Finalmente, a nova API lança uma exceção para
      indicar uma falha, e não retorna um valor booleano para indicar o sucesso ou não.
	 */
	public void enviarSMS(String destino, String origem, String[] msgs) throws SMSException;
}