package padroescomportamentais.state;

public class ReservaEstadoConfirmada extends ReservaEstado {
    
    private ReservaEstadoConfirmada() {};
    private static ReservaEstadoConfirmada instance = new ReservaEstadoConfirmada();
    public static ReservaEstadoConfirmada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmada";
    }

    public boolean alterar(Reserva reserva) {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        return true;
    }

    public boolean cancelar(Reserva reserva) {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        return true;
    }

    public boolean checkin(Reserva reserva) {
        reserva.setEstado(ReservaEstadoCheckin.getInstance());
        return true;
    }

    
}
