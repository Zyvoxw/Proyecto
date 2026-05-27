package modelo;

public class Ciudad {

    private String nombre;
    private int limpieza;

    public Ciudad() {
        nombre = "Quito";
        limpieza = 50;
    }

    // ---------------- LIMPIEZA ----------------

    public void limpiarCorrecto() {

        limpieza += 5;

        if (limpieza > 100) {
            limpieza = 100;
        }
    }

    public void ensuciar() {

        limpieza -= 5;

        if (limpieza < 0) {
            limpieza = 0;
        }
    }

    // ---------------- MOSTRAR ----------------

    public void mostrar() {

        System.out.println("\n========== CIUDAD ==========");
        System.out.println("Ciudad: " + nombre);
        System.out.println("Nivel de limpieza: " + limpieza + "%");

        if (limpieza >= 80) {

            System.out.println("Estado: Muy limpia");

        } else if (limpieza >= 50) {

            System.out.println("Estado: Estable");

        } else {

            System.out.println("Estado: Contaminada");
        }

        System.out.println("============================");
    }

    // ---------------- GETTERS ----------------

    public String getNombre() {
        return nombre;
    }

    public int getLimpieza() {
        return limpieza;
    }
}
