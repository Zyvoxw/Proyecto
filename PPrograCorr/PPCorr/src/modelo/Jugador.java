package modelo;

public class Jugador {

    private String nombre;
    private int edad;
    private int puntos;

    // Estadisticas
    private int residuosCorrectos;
    private int residuosIncorrectos;

    public Jugador(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

        puntos = 0;
        residuosCorrectos = 0;
        residuosIncorrectos = 0;
    }

    // ---------------- PUNTOS ----------------

    public void agregarPuntos(int p) {
        puntos += p;
    }

    public void quitarPuntos(int p) {
        puntos -= p;
    }

    // ---------------- ESTADISTICAS ----------------

    public void sumarCorrecto() {
        residuosCorrectos++;
    }

    public void sumarIncorrecto() {
        residuosIncorrectos++;
    }

    public int getResiduosCorrectos() {
        return residuosCorrectos;
    }

    public int getResiduosIncorrectos() {
        return residuosIncorrectos;
    }

    public int getTotalIntentos() {
        return residuosCorrectos + residuosIncorrectos;
    }

    public double getPrecision() {

        int total = getTotalIntentos();

        if (total == 0) {
            return 0;
        }

        return (double) residuosCorrectos * 100 / total;
    }

    // ---------------- NIVELES ----------------

    public int getNivel() {
        return (puntos / 100) + 1;
    }

    public int puntosFaltantes() {

        int siguienteNivel = ((puntos / 100) + 1) * 100;

        return siguienteNivel - puntos;
    }

    // ---------------- MOSTRAR ----------------

    public void mostrarPerfil() {

        System.out.println("\n========== PERFIL ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Puntos: " + puntos);
        System.out.println("Nivel: " + getNivel());
        System.out.println("Correctos: " + residuosCorrectos);
        System.out.println("Incorrectos: " + residuosIncorrectos);
        System.out.printf("Precision: %.2f%%\n", getPrecision());
        System.out.println("============================");
    }

    // ---------------- GETTERS ----------------

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntos() {
        return puntos;
    }
}