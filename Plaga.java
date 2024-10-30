package modelos;

public class Plaga {
    private String nombre;
    private String tipo; // insectos, ácaros, roedores o aves
    private String descripcion;

    public Plaga(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Plaga [Nombre=" + nombre + ", Tipo=" + tipo + ", Descripción=" + descripcion + "]";
    }
}
