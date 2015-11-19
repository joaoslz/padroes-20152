package p04_decorator;

public class CalculadoraDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
		
	}

}
