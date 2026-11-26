package proyectoAventura;

public class hunterMago {
	  // ESTADISTICAS
    int vida = 4;
    int ataqueFisico = 2;
    int poderMagico = 10;
    int defensa = 3;
    int velocidad = 6;
    int mana = 10;

    // RUTA Y FINAL
    String ruta = "Ruta Arcana";
    String finalJuego = "El conocimiento prohibido";

    // GUARDIANES
    String[] guardianes = {
        "El Astrologo de Cristal",
        "La Campanera Ciega",
        "El Archivista Hueco",
        "El Rey de la Orbita"
    };

    void StatsMago() {

        System.out.println("=== MAGO ===");
        System.out.println("Vida: " + vida);
        System.out.println("Ataque fisico: " + ataqueFisico);
        System.out.println("Poder magico: " + poderMagico);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Mana: " + mana);

    }
}

