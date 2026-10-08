package padroescomportamentais.state;

public class ReservaEstadoPendente extends ReservaEstado {
    
    private ReservaEstadoPendente() {};
    private static ReservaEstadoPendente instance = new ReservaEstadoPendente();
    public static ReservaEstadoPendente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pendente";
    }

    public boolean confirmar(Reserva reserva) {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        return true;
    }

    public boolean cancelar(Reserva reserva) {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        return true;
    }

    
}
