package p09_abstractFactory;

// Interface representando o participante AbstractFactory
public interface FabricaDeCarro {

	public abstract Motor criaMotor();

	public abstract Cambio criaCambio();
}

// Classe abstrata representando o participante AbstractProduct
