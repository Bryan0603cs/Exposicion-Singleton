package co.edu.uniquindio.poo;

public class VideoJuego {

    private String nombre;
    public Configuracion configuracion;

    public VideoJuego(String nombre, Configuracion configuracion) {
        this.nombre = nombre;
        this.configuracion = configuracion;

    }

    public String getNombre() {
        return this.nombre;
    }

    public Configuracion getConfiguracion() {
        return this.configuracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}