package co.edu.uniquindio.poo;

public class Jugador {
    private String nombre;
    private String identificacion;
    private String celular;
    private VideoJuego videoJuego;

    public Jugador(String nombre, String identificacion, String celular, VideoJuego videoJuego) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.celular = celular;
        this.videoJuego = videoJuego;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public String getCelular() {
        return this.celular;
    }

    public VideoJuego getVideoJuego() {
        return this.videoJuego;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setVideoJuego(VideoJuego videoJuego) {
        this.videoJuego = videoJuego;
    }

}
