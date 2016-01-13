package p13_flyweight.parte1;

import java.util.Arrays;
import java.util.List;

import org.jfugue.player.Player;

public class TesteMusica {

	public static void main(String[] args) {

		Player player = new Player();
		// Formato de entrada
//		player.play( "C D E F F F C# D E" );

		List<Nota> musica = Arrays.asList(new Do(), 
				new Re(), new Mi(), new Fa(), new Fa(), 
				new Sol(), new La());

		StringBuilder musicasEmNotas = new StringBuilder();

//		for (Nota nota : musica) {
//			musicasEmNotas.append(nota.simbolo() + " ");
//		}
//
//		// System.out.println(musicasEmNotas.toString());
//
//		player.play(musicasEmNotas.toString());
		
		
		Piano piano = new Piano();
		piano.toca(musica);
	}

}
