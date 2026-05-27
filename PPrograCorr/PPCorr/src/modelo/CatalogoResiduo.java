package modelo;

import java.util.Random;

public enum CatalogoResiduo {

    RESTOS_COMIDA     ("Restos comida",     "Organico",    "Organico",      25, 10),
    BOTELLA_PLASTICO  ("Botella plastico",  "Plastico",    "Reciclable",    15, 5),
    CARTON            ("Carton",            "Carton",      "Reciclable",    20, 5),
    LATAS             ("Latas",             "Metal",       "Reciclable",    25, 10),
    PERIODICOS        ("Periodicos",        "Papel",       "Reciclable",    15, 5),
    BOLSAS            ("Bolsas",            "Plastico",    "No reciclable", 15, 10),
    VIDRIO            ("Vidrio",            "Vidrio",      "Reciclable",    15, 10),
    TETRAPAK          ("Tetrapak",          "Tetrapak",    "Reciclable",    20, 10),
    PILAS             ("Pilas",             "Peligroso",   "Especial",      15, 20),
    ROPA              ("Ropa",              "Textil",      "Especial",      25, 10),
    MEDICAMENTOS      ("Medicamentos",      "Peligroso",   "Especial",      30, 20),
    SERVILLETAS       ("Servilletas",       "Organico",    "No reciclable", 20, 5),
    ELECTRODOMESTICOS ("Electrodomesticos", "Electronico", "Especial",      25, 15),
    PODA              ("Poda",              "Organico",    "Organico",      15, 5),
    PANALES           ("Pañales",           "Sanitario",   "No reciclable", 25, 10),
    VAJILLA           ("Vajilla",           "Vidrio",      "No reciclable", 25, 10),
    ACEITE            ("Aceite",            "Peligroso",   "Especial",      25, 20),
    CARTUCHOS         ("Cartuchos",         "Peligroso",   "Especial",      15, 15),
    COLILLAS          ("Colillas",          "Toxico",      "No reciclable", 20, 15),
    ENVOLTURAS        ("Envolturas",        "Plastico",    "No reciclable", 15, 10);

    private final String nombre;
    private final String tipo;
    private final String categoria;
    private final int puntos;
    private final int penalizacion;

    private static final Random RND = new Random();
    private static final CatalogoResiduo[] VALORES = values();

    CatalogoResiduo(String nombre,
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

    public Residuo crearInstancia() {

        return new Residuo(
                nombre,
                tipo,
                categoria,
                puntos,
                penalizacion
        );
    }

    public static CatalogoResiduo aleatorio() {
        return VALORES[RND.nextInt(VALORES.length)];
    }
}