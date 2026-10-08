package padroescomportamentais.state;

public abstract class ReservaEstado {
    
    public abstract String getEstado();

    public boolean confirmar(Reserva reserva) {
        return false;
    }

    public boolean alterar(Reserva reserva) {
        return false;
    }

    public boolean cancelar(Reserva reserva) {
        return false;
    }

    
    public boolean checkin(Reserva reserva) {
        return false;
    }

    public boolean checkout(Reserva reserva) {
        return false;
    }

    

    
}
