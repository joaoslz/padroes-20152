package p13_flyweight.parte2;

import java.util.Arrays;
import java.util.List;

public class TesteMusica {

	public static void main(String[] args) {

		 NotasMusicais notas = new NotasMusicais();

	        List<Nota> doReMiFa = Arrays.asList(
	            notas.pega("do#"),    
	            notas.pega("re#"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    

	            notas.pega("do#"),    
	            notas.pega("re#"),    
	            notas.pega("do"),    
	            notas.pega("re"),    
	            notas.pega("re"),    
	            notas.pega("re"),

	            notas.pega("do"),    
	            notas.pega("sol"),    
	            notas.pega("fa"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),    
	            notas.pega("mi"),

	            notas.pega("do#"),    
	            notas.pega("re#"),    
	            notas.pega("mi"),    
	            notas.pega("fa"),    
	            notas.pega("fa"),    
	            notas.pega("fa")
	        ); 
	        
	        new Piano().toca(doReMiFa);
	        
	        
		
//		List<Nota> musica = 
//		   Arrays.asList(new Do(), new Re(), new Mi(), 
//			          	 new Fa(), new Fa(0, new Sol(), 
//			          	 new La()));
	}

}
