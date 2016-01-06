package p08_factoryMethod.exemplo2;

class Homem extends Pessoa {
	
	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Olá Senhor " + this.nome);
	}
}