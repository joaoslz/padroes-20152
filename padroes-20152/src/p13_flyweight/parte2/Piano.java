package p13_flyweight.parte2;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> musica) {
		Player player = new Player();
		
		StringBuilder musicasEmNotas = new StringBuilder();
		
		for (Nota nota : musica) {
			musicasEmNotas.append(nota.simbolo() + " ");
		}
		
		player.play( musicasEmNotas.toString() );
	}

}
