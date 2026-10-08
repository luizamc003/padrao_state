package padroescomportamentais.state;

public class ReservaEstadoCheckin extends ReservaEstado {
    
    private ReservaEstadoCheckin() {};
    private static ReservaEstadoCheckin instance = new ReservaEstadoCheckin();
    public static ReservaEstadoCheckin getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Hospedado";
    }

    public boolean checkout(Reserva reserva) {
        reserva.setEstado(ReservaEstadoCheckout.getInstance());
        return true;
    }

    
}
