package Consecionario;

public class Tipo_Empresa {

    String tipoempresa;
    int idclientes;

    public Tipo_Empresa() {
    }

    public Tipo_Empresa(String tipoempresa, int idclientes) {
        this.tipoempresa = tipoempresa;
        this.idclientes = idclientes;
    }

    public String getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(String tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    @Override
    public String toString() {
        return "Tipo_Empresa{" + "tipoempresa=" + tipoempresa + ", idclientes=" + idclientes + '}';
    }

}
