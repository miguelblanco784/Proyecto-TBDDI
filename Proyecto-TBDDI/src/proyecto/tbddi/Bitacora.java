package proyecto.tbddi;

import java.util.Date;

public class Bitacora {

    Date fecha;
    String accion;

    public Bitacora() {
    }

    public Bitacora(Date fecha, String accion) {
        this.fecha = new Date();
        this.accion = accion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

}
