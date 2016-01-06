package p08_factoryMethod.exemplo2;

abstract class FactoryPessoa {

	public static Pessoa getPessoa(String nome, String sexo) {
		
		if (sexo.equals("M"))
			return new Homem(nome);
		
		else if (sexo.equals("F"))
			return new Mulher(nome);
		
		else {
			throw new IllegalStateException("Erro ao definir o objeto pessoa!");
		}
	}
}
