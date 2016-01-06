package p09_abstractFactory;

// Classe representando um participante ConcreteFactory
public class FabricaDeCarroLuxo implements FabricaDeCarro {

	// fazendo da fabrica um singleton
	private static final FabricaDeCarroLuxo INSTANCE = new FabricaDeCarroLuxo();

	public static FabricaDeCarroLuxo getInstance() {
		return INSTANCE; // retornando a instância única
	}

	public Cambio criaCambio() {
		Cambio c = new CambioAutomatico();
		c.setNumeroDeMarchas(5);
		return c;
	}

	public Motor criaMotor() {
		Motor m = new MotorGasolina();
		m.setCilindrada(2500);
		return m;
	}
}
