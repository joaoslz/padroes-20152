package p01_strategy;

public class CalculadoraDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
		
	}

}
