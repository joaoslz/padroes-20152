package p03_templateMethod;

public class CalculadoraDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
		
	}

}
