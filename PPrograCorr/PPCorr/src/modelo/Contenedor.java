package modelo;

public class Contenedor {

    private String tipo;

    public Contenedor(String tipo) {
        this.tipo = tipo;
    }

    // ---------------- VALIDAR ----------------

    public boolean validar(Residuo r) {

        return r.getCategoria().equalsIgnoreCase(tipo);
    }

    // ---------------- MOSTRAR ----------------

    public void mostrar() {

        System.out.println("\n========== CONTENEDOR ==========");
        System.out.println("Tipo de contenedor: " + tipo);
        System.out.println("================================");
    }

    // ---------------- GETTER ----------------

    public String getTipo() {
        return tipo;
    }
}
