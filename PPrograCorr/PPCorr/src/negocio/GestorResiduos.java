package negocio;

import modelo.CatalogoResiduo;
import modelo.Residuo;

public class GestorResiduos {

    public Residuo generar() {

        CatalogoResiduo catalogo = CatalogoResiduo.aleatorio();

        Residuo residuo = catalogo.crearInstancia();

        System.out.println("\nNuevo residuo generado");
        System.out.println("Nombre: " + residuo.getNombre());
        System.out.println("Tipo: " + residuo.getTipo());

        return residuo;
    }
}