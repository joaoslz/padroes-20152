package p14_memento;

import java.util.Calendar;

// Fonte 
public class Contrato {

    private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Calendar getData() {
		return data;
	}
    
    public String getCliente() {
		return cliente;
	}
    
    public TipoContrato getTipo() {
		return tipo;
	}
    

    // poderiamos aplicar o pattern state aqui
    public void avanca() {
        if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
        else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
        else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
    }
    
    
    // criado em função do memento
    // criaMemento()
    public Memento salvaEstado() {
        return new Memento(new Contrato(this.data, this.cliente, this.tipo));
    }
    
    // setMemento(Memento memento)
    public void restaura(Memento memento) {
        this.data = memento.getEstado().getData();
        this.cliente = memento.getEstado().getCliente();
        this.tipo = memento.getEstado().getTipo();
    }

}