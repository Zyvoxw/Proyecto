package modelo;

public class Residuo {

    private String nombre;
    private String tipo;
    private String categoria;
    private int puntos;
    private int penalizacion;

    public Residuo(String nombre,
                   String tipo,
                   String categoria,
                   int puntos,
                   int penalizacion) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.puntos = puntos;
        this.penalizacion = penalizacion;
    }

    // ---------------- MOSTRAR ----------------

    public void mostrar() {

        System.out.println("\n========== RESIDUO ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoria correcta: " + categoria);
        System.out.println("Puntos: " + puntos);
        System.out.println("Penalizacion: " + penalizacion);
        System.out.println("=============================");
    }

    // ---------------- GETTERS ----------------

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPenalizacion() {
        return penalizacion;
    }
}