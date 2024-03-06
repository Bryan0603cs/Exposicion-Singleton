package co.edu.uniquindio.poo;



/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Configuracion configuracion1 = Configuracion.getConfiguracion();

        Configuracion configuracion2 = Configuracion.getConfiguracion();
        configuracion2.setVolumenMusica((short)99);
        configuracion2.setVolumenSonido((short)99);




        VideoJuego videojuego = new VideoJuego("Carritos", configuracion1);

        Jugador jugador1 = new Jugador("Wirtz", "123642555", "32154694", videojuego);


        System.out.println(configuracion1==configuracion2);

        

        System.out.println("Nombre del Videojuego: " + videojuego.getNombre() + ", Nombre del jugador: " + jugador1.getNombre() + ", Identificacion: " + jugador1.getIdentificacion() + ", Celular: " + jugador1.getCelular() + ", Dificultad: " + configuracion1.getDificultad() + ", Volumen Musica: " + configuracion1.getVolumenMusica() + ", Volumen Sonido: " + configuracion1.getVolumenSonido());

        System.out.println("Nombre del Videojuego: " + videojuego.getNombre() + ", Nombre del jugador: " + jugador1.getNombre() + ", Identificacion: " + jugador1.getIdentificacion() + ", Celular: " + jugador1.getCelular() + ", Dificultad: " + configuracion2.getDificultad() + ", Volumen Musica: " + configuracion2.getVolumenMusica() + ", Volumen Sonido: " + configuracion2.getVolumenSonido());

       
        
    }

   

    
   
}
