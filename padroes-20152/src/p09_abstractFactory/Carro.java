package p09_abstractFactory;

// Um carro para receber motor e cambio
public class Carro {
	private Motor motor;
	private Cambio cambio;

	// getters e setters
	@Override
	public String toString() {
		return "motor " + motor.getCilindrada() + " cc" + "; cambio " 
	           + cambio.getNumeroDeMarchas() + " marchas";
	}

	public Cambio getCambio() {
		return cambio;
	}

	public Motor getMotor() {
		return motor;
	}
	
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}

// Classe representando o participante Client
