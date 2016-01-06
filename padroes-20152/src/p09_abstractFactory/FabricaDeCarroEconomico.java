package p09_abstractFactory;

public class FabricaDeCarroEconomico implements FabricaDeCarro {
	
	public Cambio criaCambio() {
		Cambio c = new CambioManual();
		c.setNumeroDeMarchas(5);
		return c;
	}

	public Motor criaMotor() {
		Motor m = new MotorFlex();
		m.setCilindrada(1000);
		return m;
	}
}