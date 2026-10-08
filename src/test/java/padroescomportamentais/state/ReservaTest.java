package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {

    Reserva reserva;

    @BeforeEach
    public void setUp() {
        reserva = new Reserva();
    }


    @Test
    public void deveConfirmarReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertTrue(reserva.confirmar());
        assertEquals(ReservaEstadoConfirmada.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDeveAlterarReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertFalse(reserva.alterar());
    }

    @Test
    public void deveCancelarReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertTrue(reserva.cancelar());
        assertEquals(ReservaEstadoCancelada.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDeveCheckinReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertFalse(reserva.checkin());
    }

    @Test
    public void naoDeveCheckoutReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertFalse(reserva.checkout());
    }




    @Test
    public void naoDeveConfirmarReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void deveAlterarReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.alterar());
        assertEquals(ReservaEstadoPendente.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveCancelarReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.cancelar());
        assertEquals(ReservaEstadoCancelada.getInstance(), reserva.getEstado());
    }

    @Test
    public void devecheckinReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.checkin());
        assertEquals(ReservaEstadoCheckin.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDevecheckoutReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertFalse(reserva.checkout());
    }


    @Test
    public void naoDeveConfirmarReservaHospedado() {
        reserva.setEstado(ReservaEstadoCheckin.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveAlterarReservaHospedado() {
        reserva.setEstado(ReservaEstadoCheckin.getInstance());
        assertFalse(reserva.alterar());
    }

    @Test
    public void naoDeveCancelarReservaHospedado() {
        reserva.setEstado(ReservaEstadoCheckin.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveCheckinReservaHospedado() {
        reserva.setEstado(ReservaEstadoCheckin.getInstance());
        assertFalse(reserva.checkin());
    }

    @Test
    public void deveCheckoutReservaHospedado() {
        reserva.setEstado(ReservaEstadoCheckin.getInstance());
        assertTrue(reserva.checkout());
        assertEquals(ReservaEstadoCheckout.getInstance(), reserva.getEstado());
    }



    @Test
    public void naoDeveConfirmarReservaFinalizada() {
        reserva.setEstado(ReservaEstadoCheckout.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveAlterarReservaFinalizada() {
        reserva.setEstado(ReservaEstadoCheckout.getInstance());
        assertFalse(reserva.alterar());
    }

    @Test
    public void naoDeveCancelarReservaFinalizada() {
        reserva.setEstado(ReservaEstadoCheckout.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveCheckinReservaFinalizada() {
        reserva.setEstado(ReservaEstadoCheckout.getInstance());
        assertFalse(reserva.checkin());
    }

    @Test
    public void naoDeveCheckoutReservaFinalizada() {
        reserva.setEstado(ReservaEstadoCheckout.getInstance());
        assertFalse(reserva.checkout());
    }


    

    @Test
    public void naoDeveConfirmarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveAlterarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.alterar());
    }

    @Test
    public void naoDeveCancelarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveCheckinReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.checkin());
    }

    @Test
    public void naoDeveCheckoutReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.checkout());
    }
}