package modelo;

import java.util.Random;

public class Consejo {

    private String[] consejos = {
            "Recicla correctamente para cuidar el ambiente",
            "Reduce el uso de plastico",
            "Apaga las luces que no uses",
            "Usa transporte sostenible",
            "Reutiliza materiales antes de desecharlos",
            "Separar residuos evita contaminacion",
            "Las pilas deben ir a residuos especiales",
            "El vidrio puede reciclarse muchas veces",
            "Evita desperdiciar agua",
            "Reciclar ayuda a disminuir la basura"
    };

    private Random random = new Random();

    public void mostrar() {
        int i = random.nextInt(consejos.length);
        System.out.println("\nConsejo:");
        System.out.println(consejos[i]);
    }
}