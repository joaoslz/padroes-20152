package p06_builder.parte1;

import static org.junit.Assert.*;

import org.junit.Test;

import p06_builder.exemplo3.Usuario;
import p06_builder.exemplo3.UsuarioStepBuilder;

public class UsuarioStepBuilderTest
{
	@Test
	public void getUsuarioComStepBuilder()
  	{
	    Usuario pablo = UsuarioStepBuilder.newBuilder()
	                     .nome("Fulano da Silva")
	                     .cpf("12345678901")
	                     .dataNascimento("01/04/2000")
	                     .endereco("Rua da esperança, 171")
	                     .email("fulano@email.com")
	                     .informacoes("A esperança é a última que morre")
	                     .controi();
            
      	    assertEquals("Fulano da Silva", pablo.getNome());
      	    
      	    
      	    
      	    Usuario joao = UsuarioStepBuilder.newBuilder().
        }
	
	
	
}