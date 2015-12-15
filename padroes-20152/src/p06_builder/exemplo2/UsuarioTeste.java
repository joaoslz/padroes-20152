package p06_builder.exemplo2;

public class UsuarioTeste {
	
	
	public static void main(String[] args) {
		
		Usuario usuario = 
				new Usuario.UsuarioBuilder("Fulano de Tal", "12345678901")
							        .dataNascimento("01/04/2000")
							        .endereco("Rua Sem Fim, 1000")
							        .bairro("Novo Bairro")
							        .cidade("São Luis")
							        .estado("Maranhão")
							        .informacoes("Sem comentários!")
							        .constroi();
	}

}
