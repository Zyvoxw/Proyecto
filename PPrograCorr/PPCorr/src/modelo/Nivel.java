package modelo;

public class Nivel {

    private int meta;

    public Nivel(int meta) {
        this.meta = meta;
    }

    // ---------------- VERIFICAR ----------------

    public boolean verificar(int puntos) {
        return puntos >= meta;
    }

    // ---------------- MOSTRAR ----------------

    public void mostrar() {

        System.out.println("\n========== NIVEL ==========");
        System.out.println("Meta de puntos: " + meta);

        if (meta <= 100) {

            System.out.println("Dificultad: Facil");

        } else if (meta <= 300) {

            System.out.println("Dificultad: Media");

        } else {

            System.out.println("Dificultad: Dificil");
        }

        System.out.println("===========================");
    }

    // ---------------- GETTER ----------------

    public int getMeta() {
        return meta;
    }
}