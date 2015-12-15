package p06_builder.exemplo3;
public class Usuario
{
	//todos os atributos sao obrigatorios!
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private String email;
	private String informacoes;
	
	public String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	String getDataNascimento() {
		return dataNascimento;
	}
	void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	String getEndereco() {
		return endereco;
	}
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getInformacoes() {
		return informacoes;
	}
	void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	//getters e setters para cada atributo
	
	
	
}