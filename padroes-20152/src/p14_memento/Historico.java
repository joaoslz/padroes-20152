package p14_memento;

import java.util.ArrayList;
import java.util.List;

// Lista de mementos, 
// permite várias operações de undo/redo

public class Historico {

    private List<Memento> estadosSalvos = new ArrayList<Memento>();

    public Memento pega(int index) {
        return estadosSalvos.get(index);
    }

    public void adiciona(Memento estado) {
        estadosSalvos.add(estado);
    }

}