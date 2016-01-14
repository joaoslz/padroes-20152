package p15_command.parte1;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTarefas {
    private List<Comando> comandos;
    
    
    public FilaDeTarefas() {
        comandos = new ArrayList<Comando>();
    }

    public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processa() {
        for(Comando comando : comandos) {
            comando.executa();
        }
    }
}