package padroescomportamentais.state;

public class ReservaEstadoCancelada extends ReservaEstado {

    private ReservaEstadoCancelada() {};
    private static ReservaEstadoCancelada instance = new ReservaEstadoCancelada();
    public static ReservaEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }
}