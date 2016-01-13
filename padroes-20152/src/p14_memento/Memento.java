package p14_memento;

class Memento {

    private Contrato contrato;

    Memento(Contrato contrato) {
        this.contrato = contrato;
    }

    Contrato getEstado() {
        return contrato;
    }

}