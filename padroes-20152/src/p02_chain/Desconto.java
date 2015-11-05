package p02_chain;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);

}