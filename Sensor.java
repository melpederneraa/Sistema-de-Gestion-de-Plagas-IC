package modelos;

public class Sensor {
    private String id;
    private Plaga plaga; // Referencia a la clase Plaga
    private String ubicacion;
    private int cantidadDetecciones;
    private boolean activo;

    public Sensor(String id, Plaga plaga, String ubicacion, int cantidadDetecciones, boolean activo) {
        this.id = id;
        this.plaga = plaga;
        this.ubicacion = ubicacion;
        this.cantidadDetecciones = cantidadDetecciones;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public Plaga getPlaga() {
        return plaga;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCantidadDetecciones() {
        return cantidadDetecciones;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Sensor [ID=" + id + ", Plaga=" + plaga.getNombre() + ", Ubicación=" + ubicacion +
                ", Detecciones=" + cantidadDetecciones + ", Activo=" + activo + "]";
    }
}

