package negocio;

import modelo.Ciudad;
import modelo.Jugador;
import modelo.Residuo;

public class GestorJuego {

    public void clasificar(Jugador jugador,
                           Residuo residuo,
                           String categoria,
                           Ciudad ciudad) {

        // Validar clasificacion
        if (residuo.getCategoria().equalsIgnoreCase(categoria)) {

            jugador.agregarPuntos(residuo.getPuntos());
            jugador.sumarCorrecto();

            ciudad.limpiarCorrecto();

            System.out.println("\nClasificacion correcta");
            System.out.println("Ganaste "
                    + residuo.getPuntos()
                    + " puntos");

        } else {

            jugador.quitarPuntos(residuo.getPenalizacion());
            jugador.sumarIncorrecto();

            ciudad.ensuciar();

            System.out.println("\nClasificacion incorrecta");
            System.out.println("Perdiste "
                    + residuo.getPenalizacion()
                    + " puntos");

            System.out.println("La categoria correcta era: "
                    + residuo.getCategoria());
        }

        // Mostrar estado actual
        System.out.println("\n========== ESTADO ==========");
        System.out.println("Puntos actuales: "
                + jugador.getPuntos());

        System.out.println("Nivel actual: "
                + jugador.getNivel());

        System.out.println("Limpieza ciudad: "
                + ciudad.getLimpieza() + "%");

        System.out.println("============================");
    }
}