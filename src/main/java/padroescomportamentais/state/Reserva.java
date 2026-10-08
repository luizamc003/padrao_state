package padroescomportamentais.state;

public class Reserva {

    private String nomeHospede;
    private ReservaEstado estado;

    public Reserva() {
        this.estado = ReservaEstadoPendente.getInstance();
    }

    public void setEstado(ReservaEstado estado) {
        this.estado = estado;
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean alterar() {
        return estado.alterar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean checkin() {
        return estado.checkin(this);
    }

    public boolean checkout() {
        return estado.checkout(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public ReservaEstado getEstado() {
        return estado;
    }
}