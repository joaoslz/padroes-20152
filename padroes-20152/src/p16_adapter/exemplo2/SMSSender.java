package p16_adapter.exemplo2;

//Interface Usada pelo Sistema para Envio de SMS
public interface SMSSender {
	public boolean sendSMS(SMS sms);
}