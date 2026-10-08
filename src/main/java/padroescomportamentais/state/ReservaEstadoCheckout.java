package padroescomportamentais.state;

public class ReservaEstadoCheckout extends ReservaEstado {

    private ReservaEstadoCheckout() {};
    private static ReservaEstadoCheckout instance = new ReservaEstadoCheckout();
    public static ReservaEstadoCheckout getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Checkout";
    }
}