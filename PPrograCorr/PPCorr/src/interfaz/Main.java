package interfaz;

import modelo.*;
import negocio.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      ECOCIUDAD");
        System.out.println(" Recuperacion Urbana");
        System.out.println("================================");

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        Jugador j = new Jugador(nombre, edad);
        Ciudad ciudad = new Ciudad();
        Consejo consejo = new Consejo();

        GestorResiduos gr = new GestorResiduos();
        GestorJuego juego = new GestorJuego();
        Menu menu = new Menu();

        Residuo r = null;
        int op;

        do {

            menu.mostrar();

            op = sc.nextInt();

            switch (op) {

                case 1:

                    r = gr.generar();

                    System.out.println("\n========== NUEVO RESIDUO ==========");
                    System.out.println("Nombre: " + r.getNombre());
                    System.out.println("Tipo: " + r.getTipo());
                    System.out.println("Puntos: " + r.getPuntos());
                    System.out.println("Penalizacion: " + r.getPenalizacion());
                    System.out.println("===================================");

                    break;

                case 2:

                    if (r == null) {
                        System.out.println("\nPrimero debes generar un residuo.");
                        break;
                    }

                    System.out.println("\n¿Donde deseas clasificar?");
                    System.out.println("1. Organico");
                    System.out.println("2. Reciclable");
                    System.out.println("3. No reciclable");
                    System.out.println("4. Especial");

                    int opcion = sc.nextInt();

                    String categoria = "";

                    switch (opcion) {

                        case 1:
                            categoria = "Organico";
                            break;

                        case 2:
                            categoria = "Reciclable";
                            break;

                        case 3:
                            categoria = "No reciclable";
                            break;

                        case 4:
                            categoria = "Especial";
                            break;

                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }

                    boolean correcto = r.getCategoria().equalsIgnoreCase(categoria);

                    juego.clasificar(j, r, categoria, ciudad);

                    if (correcto) {

                        System.out.println("\nCorrecto!");
                        System.out.println("Ganaste " + r.getPuntos() + " puntos");

                    } else {

                        System.out.println("\nIncorrecto");
                        System.out.println("Perdiste " + r.getPenalizacion() + " puntos");
                        System.out.println("Categoria correcta: " + r.getCategoria());
                    }

                    r = null;

                    break;

                case 3:

                    System.out.println("\n========== PERFIL ==========");
                    System.out.println("Jugador: " + j.getNombre());
                    System.out.println("Edad: " + j.getEdad());
                    System.out.println("Puntos: " + j.getPuntos());
                    System.out.println("Nivel: " + j.getNivel());
                    System.out.println("============================");

                    break;

                case 4:

                    ciudad.mostrar();

                    break;

                case 5:

                    System.out.println("\n========== NIVEL ==========");
                    System.out.println("Nivel actual: " + j.getNivel());
                    System.out.println("Puntos actuales: " + j.getPuntos());
                    System.out.println("Faltan " + j.puntosFaltantes()
                            + " puntos para subir de nivel");
                    System.out.println("===========================");

                    break;

                case 6:

                    consejo.mostrar();

                    break;

                case 7:

                    System.out.println("\nGracias por jugar EcoCiudad");
                    break;

                default:

                    System.out.println("\nOpcion invalida");

            }

        } while (op != 7);

        sc.close();
    }
}
